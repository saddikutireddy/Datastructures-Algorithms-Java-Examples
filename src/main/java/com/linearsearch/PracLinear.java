package com.linearsearch;

import org.apache.log4j.Logger;

public class PracLinear {
	
	private static final Logger LOGGER = Logger.getLogger(PracLinear.class);
	
	public static void main(String[] args) {
		
		System.out.println(lenearBasicSearch());
		System.out.println(lenearAdvanceSearch());
		
	}

	private static int lenearBasicSearch() {
		
		int []arr = {20,30,90,60,58,68,12,2};
		int searchItem = 68;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == searchItem) {
				LOGGER.info("\"Item found at position: \"" + searchItem);
				return i;
			}
		}
		LOGGER.error("\"Item not found in the given array\"");
		return -1;
	}
	
	private static int lenearAdvanceSearch() {
		
		int []arr = {20,30,90,60,58,68,12,2};
		int searchItem = 68;
		int right = arr.length-1;
		
		for (int i = 0; i <= right ; i++,right--) {
			
			if(arr[i] == searchItem) {
				LOGGER.info("\"Item found at position: \"" + i);
				return i;
			}
			if(arr[right] == searchItem) {
				LOGGER.info("\"Item found at position: \"" + right);
				return right;
		}
			
		
	}
		LOGGER.info("\"Item not found in the given array\"");
		return -1;
		
	}

}
