package com.open.store.open_store.core.model.shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Represents a shop cart from an online store
 * @author Matheus Solha
 */
public class ShopCart {
    private final List<AbstractItem> items;
    private Set<Entry<AbstractItem, Double>> itemTaxesSet;
    private double totalTaxes;
    private double total;

    public List<AbstractItem> getItems() {
        return new ArrayList<>(this.items);
    }
    
    /**
     * Adds an item to the shopping cart
     * @param item Item to be added to the shopping cart
     * @return Boolean indicating if the item has been added
     */
    public boolean addItemToCart(AbstractItem item) {
        return items.add(item);
    }
    
    /**
     * Removes an item from the shopping cart
     * @param item Item to be removed from the shopping cart
     * @return Boolean indicating if the item has been removed
     */
    public boolean removeItemFromCart(AbstractItem item) {
        return items.remove(item);
    }
    
    /**
     * Returns a set entry that contains each item with their respective
     * total tax value
     */
    public Set<Entry<AbstractItem, Double>> getItemTaxesSet() {
        return new HashSet<Entry<AbstractItem, Double>>(itemTaxesSet);
    }
    
    /**
     * Assign a set entry that contains each item with their respective
     * total tax value
     * @param itemTaxesSet Set entry to be assigned
     */
    public void setItemTaxesSet(Set<Entry<AbstractItem, Double>> itemTaxesSet) {
        this.itemTaxesSet = itemTaxesSet;
    }
    
    public double getTotalTaxes() {
        return totalTaxes;
    }
    
    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public ShopCart() {
        items = new ArrayList<>();
    }
}