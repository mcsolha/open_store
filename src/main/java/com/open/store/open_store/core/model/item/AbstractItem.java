package com.open.store.open_store.core.model.item;

import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

/**
 * Abstract class that represents what any type of product
 * will contain as properties
 * @author Matheus Solha
 */
public abstract class AbstractItem {
    protected final String name;

    protected double shelfPrice = 0;

    protected BasicTaxPolicy basicTaxPolicy;
    
    protected boolean imported = false;

    public String getName() {
        return this.name;
    }

    public double getShelfPrice() {
        return this.shelfPrice;
    }

    public void setShelfPrice(double shelfPrice) {
        this.shelfPrice = shelfPrice;
    }

    public BasicTaxPolicy getBasicTaxPolicy() {
        return this.basicTaxPolicy;
    }

    public boolean isImported() {
        return this.imported;
    }

    public boolean getImported() {
        return this.imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public AbstractItem(final String name, final BasicTaxPolicy basicTaxPolicy) {
        this.name = name;
        this.basicTaxPolicy = basicTaxPolicy;
    }

    public AbstractItem(final String name, final BasicTaxPolicy basicTaxPolicy,
            boolean imported, double shelfPrice) {
        this.name = name;
        this.basicTaxPolicy = basicTaxPolicy;
        this.imported = imported;
        this.shelfPrice = shelfPrice;
    }
}