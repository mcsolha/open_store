package com.open.store.open_store.core.model.tax;

import com.open.store.open_store.core.model.item.AbstractItem;

/**
 * Enumerable used to determine if an {@link AbstractItem} is exempted of basic
 * taxes
 * 
 * @see AbstractItem
 * @author Matheus Solha
 */
public enum BasicTaxPolicy {
    EXEMPTED, LIABLE    
}