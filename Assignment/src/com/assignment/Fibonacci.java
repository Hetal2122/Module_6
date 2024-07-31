package com.assignment;
/*
 *  Q.3  W.A.J.P to find factorial for Given Number*/

public class Fibonacci {
public static void main(String[] args) {
/*	int n = 11; // Number of terms in the Fibonacci series
    
    int firstTerm = 0;
    int secondTerm = 1;
    
    System.out.print("Fibonacci Series up to " + n + " terms: ");
    
    for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + " ");
        
        // Compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
*/
	 int n1=0,n2=1,n3,i,n4=15; 
	 
	 System.out.print(n1+" "+n2);
	 
	 for(i=1;i<n4;++i)
	 {
		 n3=n1+n2;    
		 System.out.print(" "+n3);    
		 n1=n2;    
		 n2=n3;    
	  

	 }
}
}
