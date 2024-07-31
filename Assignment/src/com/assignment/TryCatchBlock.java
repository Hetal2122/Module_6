package com.assignment;

// 15. WAP to demonstrate try catch block.

public class TryCatchBlock {
	
		public static void main(String[] args) {
			  try  
		        {  
		        int data=50/0; 
		        }  
		             
		        catch(ArithmeticException e)  
		        {  
		            System.out.println(e);  
		        }  
		        System.out.println("something is wrong");  
		   
		}

	

}
