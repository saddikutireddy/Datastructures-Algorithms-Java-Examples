package com.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearch {
	
	@Test
	public void positiveSearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 25;
		assertEquals(true, BinarySearch.binarySearch(arr, 0, arr.length-1,searchItem));
	}
	
	@Test
	public void negativeSearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 200;
		assertEquals(false, BinarySearch.binarySearch(arr, 0, arr.length-1,searchItem));
	}
	
}
