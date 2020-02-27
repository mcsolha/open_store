package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.Book;
import com.open.store.open_store.core.model.tax.BasicTax;
import com.open.store.open_store.core.service.tax.BasicTaxService;

import org.junit.jupiter.api.Test;

class BookTest {
    /**
     * Asserts that books should be exempted from basic taxes
     */
    @Test
    public void booksShouldBeExemptedFromBasicTax() {
        BasicTax basicTax = new BasicTax(0.1);
        BasicTaxService basicTaxService = new BasicTaxService(basicTax);
        Book harryPotter = new Book("Harry Potter");
        Book wildCards = new Book("Wild Cards", false, 31.75);
        Book neurocomic = new Book("Neurocomic", true, 27.50);

        assertEquals(0, basicTaxService.getItemTaxValue(harryPotter),
            "Books should be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(wildCards),
            "Books should be exempted from basic tax!");
        assertEquals(0, basicTaxService.getItemTaxValue(neurocomic),
            "Books should be exempted from basic tax!");
    }
}