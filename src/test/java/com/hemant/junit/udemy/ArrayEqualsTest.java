package com.hemant.junit.udemy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayEqualsTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] array = {12, 5, 128, 21};
		int[] expected = {5, 12, 21, 128};
		
		Arrays.sort(array);
		
		assertArrayEquals(expected, array);
	}
	
	/*
	 * Testing Exceptions
	 */
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] array = null;
		Arrays.sort(array);
	}
	
	/*
	 * Testing for performance
	 */
	
	@Test(timeout = 100)
	public void testArraySort_Performance() {
		int[] array = {12, 23, 8};
		
		for(int i = 1; i < 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
