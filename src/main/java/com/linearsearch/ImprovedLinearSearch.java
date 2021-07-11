package com.linearsearch;

import org.apache.log4j.Logger;

public class ImprovedLinearSearch {

	private static final Logger LOGGER = Logger.getLogger(ImprovedLinearSearch.class);

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 90, 10, 12, 55, 23, 66, 76 };
		search(arr, 12);
	}

	public static int search(int[] arr, int searchItem) {
		int position = -1;
		int right = arr.length - 1;

		for (int left = 0; left <= right; left++, right--) {

			if (arr[left] == searchItem) {
				LOGGER.info("Found iteam in left search at position: " + left);
				return left;
			}

			if (arr[right] == searchItem) {
				LOGGER.info("Found iteam in right search at position: " + right);
				return right;
			}

		}
		LOGGER.info("Item not found in the given array");
		return position;
	}

}
