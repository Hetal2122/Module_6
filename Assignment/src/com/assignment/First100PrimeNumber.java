package com.assignment;

/*8. WAP to compute the sum of the first 100 prime numbers.*/


public class First100PrimeNumber {
	public static void main(String[] args) {
		
		
		 int count = 0;
	     long sum = 0;
	     int number = 2; // Starting from the first prime number

	     while (count < 100) {
	         if (isPrime(number)) {
	             sum += number;
	             count++;
	         }
	         number++;
	     }
	     System.out.println("Sum of the first 100 prime numbers: " + sum);
	}
	    
	  // Method to check if a number is prime
	       private static boolean isPrime(int num) {
	         if (num < 2) {
	             return false;
	         }
	         for (int i = 2; i <= Math.sqrt(num); i++) {
	             if (num % i == 0) {
	                 return false;
	             }
	         }
	         return true;
	

}
}