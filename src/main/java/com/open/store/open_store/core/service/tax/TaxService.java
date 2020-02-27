package com.open.store.open_store.core.service.tax;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Base interface for tax services
 * @author Matheus Solha
 */
public interface TaxService {
    /**
     * Calculates the tax to be paid on a given item
     * @param item Applicable item
     */
    public double getItemTaxValue(AbstractItem item);
}