package com.open.store.open_store.core.model.tax;

/**
 * Represents the basic tax that will be charged in products that is not
 * exempted from it
 * 
 * @see BasicTaxPolicy
 * @author Matheus Solha
 */
public class BasicTax extends AbstractSaleTax {

    public BasicTax(double rate) {
        super(rate);
    }
    
}