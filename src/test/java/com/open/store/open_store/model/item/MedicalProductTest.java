package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.MedicalProduct;
import com.open.store.open_store.core.model.tax.BasicTax;
import com.open.store.open_store.core.service.tax.BasicTaxService;

import org.junit.jupiter.api.Test;

public class MedicalProductTest {
    /**
     * Asserts that medical products should be exempted from basic taxes
     */
    @Test
    public void medicalProductsShouldBeExemptedFromBasicTax() {
        BasicTax basicTax = new BasicTax(0.1);
        BasicTaxService basicTaxService = new BasicTaxService(basicTax);
        MedicalProduct bandAid = new MedicalProduct("Band-Aid");
        MedicalProduct gauze = new MedicalProduct("Gauze", false, 2.33);
        MedicalProduct aspirin = new MedicalProduct("Aspirin", true, 5.47);

        assertEquals(0, basicTaxService.getItemTaxValue(gauze),
            "Medical Products should be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(aspirin),
            "Medical Products be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(bandAid),
            "Medical Products should be exempted from basic tax!");
    }
}