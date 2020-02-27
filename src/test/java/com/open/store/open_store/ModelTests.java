package com.open.store.open_store;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.BasicTaxPolicy;
import com.open.store.open_store.core.model.item.Book;
import com.open.store.open_store.core.model.item.Food;
import com.open.store.open_store.core.model.item.MedicalProduct;

import org.junit.jupiter.api.Test;

class ModelTests {
    @Test
    public void booksShouldBeExemptedFromBasicTax () {
        Book neurocomic = new Book("Neurocomic");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone");
        Book wildCards = new Book("Wild Cards");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            neurocomic.getBasicTaxPolicy(),
            "The Neurocomic book should be exempted from basic tax");
            
        assertEquals(BasicTaxPolicy.EXEMPTED,
            harryPotter.getBasicTaxPolicy(),
            "The Harry Potter book should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            wildCards.getBasicTaxPolicy(),
            "The Wild Cards book should be exempted from basic tax");
    }

    @Test
    public void foodsShouldBeExemptedFromBasicTax () {
        Food banana = new Food("Banana");
        Food rice = new Food("Rice");
        Food whiteBeans = new Food("White Beans");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            banana.getBasicTaxPolicy(),
            "Banana should be exempted from basic tax");
            
        assertEquals(BasicTaxPolicy.EXEMPTED,
            rice.getBasicTaxPolicy(),
            "Rice should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            whiteBeans.getBasicTaxPolicy(),
            "White Beans should be exempted from basic tax");
    }

    @Test
    public void medicalProductsShouldBeExemptedFromBasicTax () {
        MedicalProduct gauze = new MedicalProduct("Gauze");
        MedicalProduct aspirin = new MedicalProduct("Aspirin");
        MedicalProduct bandAid = new MedicalProduct("Band-Aid");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            gauze.getBasicTaxPolicy(),
            "Gauze should be exempted from basic tax");
            
        assertEquals(BasicTaxPolicy.EXEMPTED,
            aspirin.getBasicTaxPolicy(),
            "Aspirin should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED,
            bandAid.getBasicTaxPolicy(),
            "Band-Aid should be exempted from basic tax");
    }

}