package com.open.store.open_store.core.exception;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Exception thrown when null is passed as BasicTaxPolicy
 * to a {@link AbstractItem}
 * @author Matheus Solha
 */
public class InvalidBasicTaxPolicyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidBasicTaxPolicyException() {
        super("BasicTaxPolicy cannot be null");
    }
}