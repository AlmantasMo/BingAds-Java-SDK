package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location.BulkAdGroupLocationCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupLocationCriterion;
import com.microsoft.bingads.v13.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationCriterionReadTargetTest extends BulkAdGroupLocationCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 12L},
                        {"23", 23L},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkAdGroupLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupLocationCriterion c) {
                        return ((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getLocationId();
                    }
                }
        );
    }
}
