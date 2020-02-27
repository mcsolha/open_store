package com.open.store.open_store.core.service.shop;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.open.store.open_store.core.model.item.AbstractItem;
import com.open.store.open_store.core.model.shop.ShopCart;
import com.open.store.open_store.core.service.tax.BasicTaxService;
import com.open.store.open_store.core.service.tax.ImportDutyService;

import static com.open.store.open_store.core.utils.Rounding.*;

/**
 * Service responsible for calculating the final receipt which contains
 * the total amount of taxes applied for each product and the total taxes value.
 * @author Matheus Solha
 */
public class ShopService {
    private final ShopCart shopCart;

    private final BasicTaxService basicTaxService;

    private final ImportDutyService importDutyService;

    public ShopService(ShopCart shopCart, BasicTaxService basicTaxService,
        ImportDutyService importDutyService) {
        this.shopCart = shopCart;
        this.basicTaxService = basicTaxService;
        this.importDutyService = importDutyService;
    }

    /**
     * Calculates the total price (including all taxes that may apply) of
     * the shopcart
     * @return The total price of the shopcart
     */
    public double getTotal() {
        double total = roundToTheNearestPointZeroFive(this.getTotalTaxes()
            + this.getItemsTotalShelfPrice());

        this.shopCart.setTotal(total);

        return total;
    }

    /**
     * Calculates the sum of all item shelf prices
     * @return The total value of items shelf prices
     */
    public double getItemsTotalShelfPrice() {
        List<AbstractItem> items = this.shopCart.getItems();

        return roundToTheNearestPointZeroFive(items.stream()
            .mapToDouble(item -> item.getShelfPrice())
            .reduce(0, (accumulator, value) -> (accumulator + value)));
    }

    /**
     * Calculate the total taxes value of the shop cart
     * @return The total value of the items in the shop cart
     */
    public double getTotalTaxes() {
        double totalTaxes = 0;

        Set<Entry<AbstractItem, Double>> itemsTaxesSet = this.getItemsTaxesSet();

        totalTaxes = roundToTheNearestPointZeroFive(itemsTaxesSet
            .stream()
            .mapToDouble(entry -> entry.getValue())
            .reduce(0, (accumulator, value) -> (accumulator + value)));

        this.shopCart.setTotalTaxes(totalTaxes);

        return totalTaxes;
    }
    
    /**
     * Gets the total amount of tax chargeable over an item
     * @param item Item to get the total amount
     * @return Total amount of tax
     */
    public double getItemTotalTax(AbstractItem item) {
        return roundToTheNearestPointZeroFive(basicTaxService.getItemTaxValue(item)
            + importDutyService.getItemTaxValue(item));
    }

    /**
     * Gets an entry set that represents an key value pair
     * containing the item and its calculated tax
     * @return Entry set with each item and its calculated tax
     */
    public Set<Entry<AbstractItem, Double>> getItemsTaxesSet() {
        List<AbstractItem> items = shopCart.getItems();

        Set<Entry<AbstractItem, Double>> itemTaxesSet = items.stream()
            .collect(Collectors.toMap(Function.identity(),
                this::getItemTotalTax))
            .entrySet();
        
        shopCart.setItemTaxesSet(itemTaxesSet);

        return shopCart.getItemTaxesSet();
    }

}