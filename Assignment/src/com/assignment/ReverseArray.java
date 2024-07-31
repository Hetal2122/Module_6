package com.assignment;

import java.util.Scanner;

// 23. WAP to reverse an array of integer values.



public class ReverseArray {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println(" Reverse Array Elements:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
	}

}
