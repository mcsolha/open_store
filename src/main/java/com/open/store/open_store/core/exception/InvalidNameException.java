package com.open.store.open_store.core.exception;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Exception thrown when an invalid name is passed to a {@link AbstractItem}
 * @author Matheus Solha
 */
public class InvalidNameException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidNameException() {
        super("Invalid String for name");
    }
}