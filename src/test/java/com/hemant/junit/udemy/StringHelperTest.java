package com.hemant.junit.udemy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_BestCaseScenario() {
		
		assertEquals("BCD", stringHelper.truncateAInFirst2Positions("AABCD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPositionScenario() {
		
		assertEquals("BCD", stringHelper.truncateAInFirst2Positions("ABCD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoAScenario() {
		
		assertEquals("BCD", stringHelper.truncateAInFirst2Positions("BCD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AAtLastPositionScenario() {
		
		assertEquals("BCDAA", stringHelper.truncateAInFirst2Positions("BCDAA"));
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCDAB"));
	}
}
