package com.microsoft.bingads.v13.api.test.entities.ads.dynamicSearch.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.dynamicSearch.BulkDynamicSearchAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDynamicSearchAd;

@RunWith(Parameterized.class)
public class BulkDynamicSearchAdWriteToRowValuesPath2Test extends BulkDynamicSearchAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"path2", "path2"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Path 2", this.datum, this.propertyValue, new BiConsumer<BulkDynamicSearchAd, String>() {
            @Override
            public void accept(BulkDynamicSearchAd c, String v) {
                c.getDynamicSearchAd().setPath2(v);
            }
        });
    }
}
