package com.open.store.open_store.core.model.item;

import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

/**
 * Represents an item sold in the store
 * @author Matheus Solha
 */
public class Item extends AbstractItem {

    public Item(String name, BasicTaxPolicy basicTaxPolicy,
            boolean imported, double shelfPrice) {
        super(name, basicTaxPolicy, imported, shelfPrice);
    }

}