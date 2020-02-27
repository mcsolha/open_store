package com.open.store.open_store.core.model.item;

/**
 * Represents a book sold in the store.
 * Books are exempted from basic taxes.
 * @author Matheus Solha
 */
public class Book extends AbstractItem {

    public Book(String name) {
        super(name, BasicTaxPolicy.EXEMPTED);
    }

}