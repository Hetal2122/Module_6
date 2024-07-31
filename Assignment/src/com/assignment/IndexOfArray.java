package com.assignment;

import java.util.Scanner;

// 11. WAP to find the index of an array element.



public class IndexOfArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input target element to find
        System.out.print("Enter the element to find the index for: ");
        int fi = scanner.nextInt();

        // Find index of target element
        int index = findIndex(arr,fi );

        // Output the result
        if (index != -1) {
            System.out.println("The index of " + fi + " in the array is: " + index);
        } else {
            System.out.println(fi + " is not present in the array.");
        }

        scanner.close();
    }

    public static int findIndex(int[] arr, int fi) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fi )
            {
                return i;
            }
        }
        return -1;
		
	}

}
