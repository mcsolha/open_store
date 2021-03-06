package com.open.store.open_store.core.model.item;

import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

/**
 * Represents a food sold in the store. Foods are exempted from basic taxes.
 * 
 * @author Matheus Solha
 */
public class Food extends AbstractItem {

    public Food(String name) {
        super(name, BasicTaxPolicy.EXEMPTED);
    }

    public Food(String name, boolean imported, double shelfPrice) {
        super(name, BasicTaxPolicy.EXEMPTED, imported, shelfPrice);
    }

}