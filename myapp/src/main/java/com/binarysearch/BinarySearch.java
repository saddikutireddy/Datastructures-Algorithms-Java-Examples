package com.binarysearch;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class BinarySearch {

	private static final Logger LOGGER = Logger.getLogger(BinarySearch.class);

	public static void main(String[] args) {

		int [] arr  = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		BinarySearch binarySearch =new BinarySearch();
		if (!binarySearch.binarySearch(arr, 0, n - 1, x))
			LOGGER.info("Element not present");
		else
			LOGGER.info("Element found");
	}

	public boolean binarySearch(int [] arr, int left, int r, int x) {
		Arrays.sort(arr);
		if (r >= left) {
			int mid = left + (r - left) / 2;

			if (arr[mid] == x)
				return true;

			if (arr[mid] > x)
				return binarySearch(arr, left, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return false;
	}

}
