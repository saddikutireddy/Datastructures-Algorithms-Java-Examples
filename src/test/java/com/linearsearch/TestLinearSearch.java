package com.linearsearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinearSearch {

	@Test
	public void positiveSearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 25;
		ImprovedLinearSearch improvedLinearSearch= new ImprovedLinearSearch();
		int search = improvedLinearSearch.search(arr, searchItem);
		assertEquals(7, search);
	}
	
	@Test
	public void negativeSearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 200;
		ImprovedLinearSearch improvedLinearSearch= new ImprovedLinearSearch();
		int search = improvedLinearSearch.search(arr, searchItem);
		assertEquals(-1, search);
	}
	
	@Test
	public void positiveBsearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 25;
		LinearSearchBasic linearSearchBasic= new LinearSearchBasic();
		int search = linearSearchBasic.search(arr, searchItem);
		assertEquals(7, search);
	}
	
	@Test
	public void negativeBsearch() {
		int [] arr = { 20, 30, 28, 33, 36, 37, 99, 25, 65 };
		int searchItem = 200;
		LinearSearchBasic linearSearchBasic= new LinearSearchBasic();
		int search = linearSearchBasic.search(arr, searchItem);
		assertEquals(-1, search);
	}

}
