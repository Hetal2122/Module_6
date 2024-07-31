package com.assignment;

/* 10. WAP to calculate the average value of array elements. */

public class AveragevalueOfArray {
	public static void main(String[] args) {
		 int[] array = {7, 15, 8, 2, 6, 5};
	        
	        
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        
	       
	        double average = (double) sum / array.length;
	        
	      
	        System.out.println("Sum of array elements: " + sum);
	        System.out.println("Average value of array elements: " + average);
	}

}
