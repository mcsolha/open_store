package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.Food;
import com.open.store.open_store.core.model.tax.BasicTax;
import com.open.store.open_store.core.service.tax.BasicTaxService;

import org.junit.jupiter.api.Test;

public class FoodTest {
    /**
     * Asserts that foods should be exempted from basic taxes
     */
    @Test
    public void foodsShouldBeExemptedFromBasicTax() {
        BasicTax basicTax = new BasicTax(0.1);
        BasicTaxService basicTaxService = new BasicTaxService(basicTax);
        Food banana = new Food("Banana");
        Food rice = new Food("Rice", false, 31.75);
        Food whiteBeans = new Food("White beans", true, 27.50);

        assertEquals(0, basicTaxService.getItemTaxValue(banana),
            "Foods should be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(rice),
            "Foods should be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(whiteBeans),
            "Foods should be exempted from basic tax!");
    }
    
}