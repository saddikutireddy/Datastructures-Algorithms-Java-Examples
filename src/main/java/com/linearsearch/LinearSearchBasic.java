package com.linearsearch;

import org.apache.log4j.Logger;

public class LinearSearchBasic {

	private static final Logger LOGGER = Logger.getLogger(LinearSearchBasic.class);

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 90, 10, 12, 55, 23, 66, 76 };
		search(arr, 12);
	}

	public static int search(int[] arr, int searchItem) {
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchItem) {
				LOGGER.info("\"Item found at position: \"" + i);
				return i;
			}
		}
		LOGGER.info("\"Item not found in the given array\"");
		return position;
	}

}
