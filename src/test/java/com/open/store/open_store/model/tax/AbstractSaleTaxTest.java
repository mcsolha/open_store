package com.open.store.open_store.model.tax;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.open.store.open_store.core.exception.InvalidRateException;
import com.open.store.open_store.core.model.tax.AbstractSaleTax;
import com.open.store.open_store.core.model.tax.BasicTax;
import com.open.store.open_store.core.model.tax.ImportDuty;

import org.junit.jupiter.api.Test;

public class AbstractSaleTaxTest {
    /**
     * Asserts that tax rate of classes inherited from {@link AbstractSaleTax}
     * should not be greater than 1 neither fewer than 0
     */
    @Test()
    public void abstractSaleTaxRateShouldNotBeGreaterThan1AndFewerThan0() {
        assertThrows(InvalidRateException.class, () -> new BasicTax(1.1));
        assertThrows(InvalidRateException.class, () -> new BasicTax(1.13));
        assertThrows(InvalidRateException.class, () -> new ImportDuty(3.42));
        assertThrows(InvalidRateException.class, () -> new ImportDuty(6.73));

        assertThrows(InvalidRateException.class, () -> new BasicTax(-0.1));
        assertThrows(InvalidRateException.class, () -> new BasicTax(-1.23));
        assertThrows(InvalidRateException.class, () -> new ImportDuty(-1.123));
        assertThrows(InvalidRateException.class, () -> new ImportDuty(-6.987));
    }
}