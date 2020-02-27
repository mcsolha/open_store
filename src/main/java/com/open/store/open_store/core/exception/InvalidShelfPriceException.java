package com.open.store.open_store.core.exception;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Exception thrown when an invalid value is passed to shelfPrice
 * for a {@link AbstractItem}
 * @author Matheus Solha
 */
public class InvalidShelfPriceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidShelfPriceException() {
        super("Shelf price can not be negative");
    }
}