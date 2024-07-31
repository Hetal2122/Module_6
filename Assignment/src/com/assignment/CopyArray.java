package com.assignment;

import java.util.Arrays;

// 22.WAP to Copy one array into another



public class CopyArray {
	public static void main(String[] args) {
		
		
		 int[] originalArray = {11, 2, 43, 4,55};

	       
	        int[] copiedArray = new int[originalArray.length];

	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
	}

}
