package com.assignment;

// 16.WAP to demonstrate multiple catch blocks

public class MultipleTryCatch {
	public static void main(String[] args) {
		
		  try{    
              int a[]=new int[6];    
              
              System.out.println(a[12]);  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    
	}

}
