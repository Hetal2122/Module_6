package com.assignment;

/*
 *  
 * 1 
  2 2 
 3 3 3 
4 4 4 4  */


public class Patten3 {
public static void main(String[] args) {
	int rows = 4; 
    


    for (int i = 1; i <= rows; i++) {
        
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        
        for (int k = 1; k <= i; k++) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
}
}
