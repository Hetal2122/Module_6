package com.assignment;
/*
 *  Q.7.1 W.A.J.P to Print pattern Given Below.
1)
1
12
123
1234
12345 */

public class NumberPattern {
	public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

	}

}
