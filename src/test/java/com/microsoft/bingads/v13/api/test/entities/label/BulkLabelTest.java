package com.microsoft.bingads.v13.api.test.entities.label;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkLabel;
import com.microsoft.bingads.v13.campaignmanagement.Label;

public abstract class BulkLabelTest extends BulkEntityTest<BulkLabel> {

    @Override
    protected void onEntityCreation(BulkLabel entity) {
        entity.setLabel(new Label());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkLabel, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkLabel>() {
            @Override
            public BulkLabel get() {
                return new BulkLabel();
            }
        });
    }
}
