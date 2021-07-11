package com.binarysearch;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class BinarySearch {

	private static final Logger LOGGER = Logger.getLogger(BinarySearch.class);

	public static void main(String[] args) {
		int [] arr  = { 2, 3, 4, 10, 40 };
		BinarySearch binarySearch =new BinarySearch();
		binarySearch.binarySearch(arr, 0, arr.length - 1, 10);

	}

	public boolean binarySearch(int [] arr, int left, int r, int x) {
		Arrays.sort(arr);
		if (r >= left) {
			int mid = left + (r - left) / 2;

			if (arr[mid] == x) {
				LOGGER.info("Element found");
				return true;
			}
			if (arr[mid] > x)
				return binarySearch(arr, left, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		LOGGER.info("Element not present");
		return false;
	}

}
