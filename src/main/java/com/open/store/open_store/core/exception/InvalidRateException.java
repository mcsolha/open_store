package com.open.store.open_store.core.exception;

import com.open.store.open_store.core.model.tax.AbstractSaleTax;

/**
 * Exception thrown when an invalid rate is passed to a {@link AbstractSaleTax}
 * @author Matheus Solha
 */
public class InvalidRateException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidRateException() {
        super("Invalid value for rate");
    }
}