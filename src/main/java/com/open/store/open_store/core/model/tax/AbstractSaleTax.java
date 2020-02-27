package com.open.store.open_store.core.model.tax;

import com.open.store.open_store.core.exception.InvalidRateException;

/**
 * Abstract class that represents what any type of tax
 * will contain as properties
 * @author Matheus Solha
 */
public abstract class AbstractSaleTax {
    private final double rate;

    public double getRate() {
        return this.rate;
    }

    public AbstractSaleTax(final double rate) {
        if (rate <= 0 || rate > 1) {
            throw new InvalidRateException();
        }

        this.rate = rate;
    }
}