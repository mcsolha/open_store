package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.Food;
import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

import org.junit.jupiter.api.Test;

public class FoodTest {
    /**
     * Asserts that foods should be exempted from basic taxes
     */
    @Test
    public void foodsShouldBeExemptedFromBasicTax() {
        Food banana = new Food("Banana");
        Food rice = new Food("Rice");
        Food whiteBeans = new Food("White Beans");

        assertEquals(BasicTaxPolicy.EXEMPTED, banana.getBasicTaxPolicy(), "Banana should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, rice.getBasicTaxPolicy(), "Rice should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, whiteBeans.getBasicTaxPolicy(),
                "White Beans should be exempted from basic tax");
    }
}