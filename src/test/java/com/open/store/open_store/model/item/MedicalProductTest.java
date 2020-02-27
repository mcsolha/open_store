package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.MedicalProduct;
import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

import org.junit.jupiter.api.Test;

public class MedicalProductTest {
    /**
     * Asserts that medical products should be exempted from basic taxes
     */
    @Test
    public void medicalProductsShouldBeExemptedFromBasicTax() {
        MedicalProduct gauze = new MedicalProduct("Gauze");
        MedicalProduct aspirin = new MedicalProduct("Aspirin");
        MedicalProduct bandAid = new MedicalProduct("Band-Aid");

        assertEquals(BasicTaxPolicy.EXEMPTED, gauze.getBasicTaxPolicy(), "Gauze should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, aspirin.getBasicTaxPolicy(), "Aspirin should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, bandAid.getBasicTaxPolicy(),
                "Band-Aid should be exempted from basic tax");
    }
}