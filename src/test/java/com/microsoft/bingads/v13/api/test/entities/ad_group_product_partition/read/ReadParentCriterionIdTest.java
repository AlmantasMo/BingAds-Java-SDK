package com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

@RunWith(Parameterized.class)
public class ReadParentCriterionIdTest extends BulkAdGroupProductPartitionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testReadExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "Yes");
        values.put("Parent Criterion Id", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductPartition c) {
                        return ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getParentCriterionId();
                    }
                }
        );
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Parent Criterion Id", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductPartition c) {
                        return ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getParentCriterionId();
                    }
                }
        );
    }
}
