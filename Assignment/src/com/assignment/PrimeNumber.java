package com.assignment;
/*4 .W.A.J.P to check given number is Prime or not? */

public class PrimeNumber {
	public static void main(String[] args) {
		 int number = 24; // Change this value to check if a different number is prime

	        if (number <= 1) {
	            System.out.println(number + " is not a prime number.");
	        } else {
	            boolean isPrime = true;
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is not a prime number.");
	            }
	        }

	}

}
