package com.binarysearch;

import org.apache.log4j.Logger;

public class BinarySearch {

	private static final Logger LOGGER = Logger.getLogger(BinarySearch.class);

	public static void main(String[] args) {

		int [] arr  = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			LOGGER.info("Element not present");
		else
			LOGGER.info("Element found at index " + result);
	}

	public static int binarySearch(int [] arr, int left, int r, int x) {
		if (r >= left) {
			int mid = left + (r - left) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, left, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

}
