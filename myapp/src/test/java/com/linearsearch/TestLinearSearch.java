package com.linearsearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinearSearch {

	@Test
	public void positiveSearch() {
		int arr[] = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 25;
		int search = ImprovedLinearSearch.search(arr, searchItem);
		assertEquals(7, search);
	}
	
	@Test
	public void negativeSearch() {
		int arr[] = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 200;
		int search = ImprovedLinearSearch.search(arr, searchItem);
		assertEquals(-1, search);
	}

}
