package com.linearsearch;

import org.apache.log4j.Logger;

public class ImprovedLinearSearch {
	
	private static final Logger LOGGER = Logger.getLogger(ImprovedLinearSearch.class);
	
	public static void main(String[] args) {
		
		int arr [] = {20,30,40,90,10,12,55,23,66,76};
		int searchItem = 12;
		
		int searchIndex = search(arr,searchItem);
		
		if(searchIndex == -1) {
			LOGGER.info("Item not found in the given array");
		}else {
			LOGGER.info("Item found at position: "+searchIndex);
		}
		
	}

	public static int search(int[] arr, int searchItem) {
		int position = -1;
		int right = arr.length-1;
		
		for (int left = 0; left <= right;left++,right--) {
			
			if(arr[left] == searchItem) {
				LOGGER.info("Found iteam in left search " +left);
				return left;
			}
			
			if(arr[right] == searchItem) {
				LOGGER.info("Found iteam in right search " +right);
				return right;
			}
			
		}
		
		return position;
	}
		

}
