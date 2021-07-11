package com.binarysearch;

import java.util.Arrays;

public class IterativeBinarySearch {
	
	public static void main(String[] args) {
	    int []arr = { 2, 3, 4, 10, 40 };
		binarySearch(arr, 10);
	}
	
	public static int binarySearch(int []arr, int x)
    {
		Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

}
