package com.open.store.open_store.core.service.tax;

import static com.open.store.open_store.core.utils.Rounding.roundToTheNearestPointZeroFive;

import com.open.store.open_store.core.model.item.AbstractItem;
import com.open.store.open_store.core.model.tax.ImportDuty;

/**
 * Service responsible for calculating the import duty on products
 * @author Matheus Solha
 */
public class ImportDutyService implements TaxService {
    private final ImportDuty importDuty;

    public ImportDutyService(final ImportDuty importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getItemTaxValue(AbstractItem item) {
        return item.isImported()
            ? roundToTheNearestPointZeroFive(item.getShelfPrice()
                * importDuty.getRate())
            : 0;
    }

}