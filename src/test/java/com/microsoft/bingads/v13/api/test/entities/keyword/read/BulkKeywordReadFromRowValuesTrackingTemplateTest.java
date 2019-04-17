package com.microsoft.bingads.v13.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeyword;

public class BulkKeywordReadFromRowValuesTrackingTemplateTest extends BulkKeywordTest{

	@Parameter(value = 1)
	public String expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", ""},
			{"template", "template"},
		});
	}
	
	@Test
	public void testRead() {
		this.<String>testReadProperty("Tracking Template", this.datum, this.expectedResult, new Function<BulkKeyword, String>() {
			@Override
			public String apply(BulkKeyword c) {
				return c.getKeyword().getTrackingUrlTemplate();
			}
		});
	}
}
