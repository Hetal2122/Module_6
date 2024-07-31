package com.assignment;

import java.util.Scanner;

/*
 *   26  W.A.J.P. which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		Marks Grade
		91-100 AA
		81-90 AB
		71-80 BB
		61-70 BC
		51-60 CD
		41-50 DD
		<=40 Fail
		 
  *
  */

public class Gread {
	public static void main(String[] args) {
		
		
		int a;
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("Enter your marks (out of 100) : ");
		a=sc.nextInt();
		
		if (a>=91 &&a<=100) {
			System.out.println("your grade is : AA");
		} 
		else if (a>=81 && a<=90) {
			System.out.println("your grade is :AB");
		}
		else if (a>=71 && a<=80) {
			System.out.println("your grade is :BB");
		}
		else if (a>=61 && a<=70) {
			System.out.println("your grade is :BC");
		}
		else if (a>=51 && a<=60) {
			System.out.println("your grade is :CD");
		}
		else if (a>=41 && a<=50) {
			System.out.println("your grade is :DD");
		}
		else if (a<=40) {
			System.out.println("sorry! you are Fail ");
		}else {
			System.out.print("Enter between  out of 100");
		}
	}

}
