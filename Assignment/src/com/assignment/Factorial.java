package com.assignment;
/*
 * 6. W.A.J.P to find factorial for Given Number
 */

public class Factorial {

public static void main(String[] args) {
	int number = 7; 
    
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    
    System.out.println("The factorial of " + number + " is: " + factorial);

}
}
