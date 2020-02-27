package com.open.store.open_store.core.model.item;

/**
 * Represents a medical product sold in the store.
 * Medical products are exempted from basic taxes.
 * @author Matheus Solha
 */
public class MedicalProduct extends AbstractItem {

    public MedicalProduct(String name) {
        super(name, BasicTaxPolicy.EXEMPTED);
    }

}