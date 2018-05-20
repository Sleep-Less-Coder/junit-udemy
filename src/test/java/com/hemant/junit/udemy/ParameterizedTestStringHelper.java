package com.hemant.junit.udemy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParameterizedTestStringHelper {
	
	StringHelper stringHelper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = {
				{"AAACDEF", "ACDEF"},
				{"ACD", "CD"},
				{"BC", "BC"}
		};
		return Arrays.asList(expectedOutputs);
	}
	
	public ParameterizedTestStringHelper(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
		
	}
}
