package com.open.store.open_store.model.item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.open.store.open_store.core.model.item.Book;
import com.open.store.open_store.core.model.tax.BasicTaxPolicy;

import org.junit.jupiter.api.Test;

class BookTest {
    /**
     * Asserts that books should be exempted from basic taxes
     */
    @Test
    public void booksShouldBeExemptedFromBasicTax() {
        Book neurocomic = new Book("Neurocomic");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone");
        Book wildCards = new Book("Wild Cards");

        assertEquals(BasicTaxPolicy.EXEMPTED, neurocomic.getBasicTaxPolicy(),
                "The Neurocomic book should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, harryPotter.getBasicTaxPolicy(),
                "The Harry Potter book should be exempted from basic tax");

        assertEquals(BasicTaxPolicy.EXEMPTED, wildCards.getBasicTaxPolicy(),
                "The Wild Cards book should be exempted from basic tax");
    }

}