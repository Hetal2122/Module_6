package com.assignment;

import java.util.Scanner;

// 20. WAP to iterate through all elements in an array list.


public class UpdateArrayListElement {
	public static void main(String[] args) {
		
		 int len, index, newValue;
	        Scanner sc = new Scanner(System.in);
	        
	     
	        System.out.print("Enter length of the array: ");
	        len = sc.nextInt();
	        
	        
	        int[] arr = new int[len];
	        
	        System.out.println("Enter elements:");
	        for(int i = 0; i < len; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.print("Original Array: ");
	        for(int i = 0; i < len; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        
	        
	        System.out.print("Enter index of the element to update (0 to " + (len - 1) + "): ");
	        index = sc.nextInt();
	        
	        
	        System.out.print("Enter new value: ");
	        newValue = sc.nextInt();
	        
	        
	        if (index >= 0 && index < len) {
	            
	            arr[index] = newValue;
	            
	            
	            System.out.print("Updated Array: ");
	            for(int i = 0; i < len; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Invalid index. Element update failed.");
	        }
	        
	        sc.close();
	}

}
