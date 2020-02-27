package com.open.store.open_store.core.exception;

public class InvalidRateException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidRateException() {
        super("Invalid value for rate");
    }
}