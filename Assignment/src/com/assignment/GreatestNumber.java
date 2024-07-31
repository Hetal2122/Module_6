package com.assignment;
/*
 *   1 .W.A.J.P to Take three numbers from the user and print the greatest number

*/

public class GreatestNumber {
	public static void main(String[] args) {
		
		
        int num1 = 17;
        int num2 = 36;
        int num3 = 24;
        
        int greatest ;
        
        if (num1 >= num2 && num1 >= num3) {
            greatest  = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

    
        System.out.println("The greatest number is: " + greatest);


	}

}
