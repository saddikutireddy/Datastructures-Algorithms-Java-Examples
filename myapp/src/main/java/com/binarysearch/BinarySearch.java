package com.binarysearch;

import org.apache.log4j.Logger;

public class BinarySearch {

	private static final Logger LOGGER = Logger.getLogger(BinarySearch.class);

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			LOGGER.info("Element not present");
		else
			LOGGER.info("Element found at index " + result);
	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

}
