package com.open.store.open_store.core.service.tax;

import static com.open.store.open_store.core.utils.Rounding.roundToTheNearestPointZeroFive;

import com.open.store.open_store.core.model.item.AbstractItem;
import com.open.store.open_store.core.model.tax.BasicTax;

/**
 * Service responsible for calculating the basic tax on products
 * @author Matheus Solha
 */
public class BasicTaxService implements TaxService {
    private final BasicTax basicTax;

    public BasicTaxService(final BasicTax basicTax) {
        this.basicTax = basicTax;
    }

    @Override
    public double getItemTaxValue(AbstractItem item) {
        double itemTaxValue = 0;

        switch (item.getBasicTaxPolicy()) {
            case LIABLE:
                itemTaxValue = roundToTheNearestPointZeroFive(basicTax.getRate()
                    * item.getShelfPrice());
                break;

            case EXEMPTED:
            default:
                break;
        }

        return itemTaxValue;
    }
}