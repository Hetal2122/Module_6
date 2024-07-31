package com.assignment;

/* 25.W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name'message' that
 *  prints "This is first subclass" and "This is second subclass" respectively.all the methods 'message' by creating an object for each subclass.
*/

abstract class Parent{
    public abstract void message();
}
class FirstSubclass extends Parent {
    public void message() {
        System.out.println("This is First subclass");
    }
}
class SecondSubclass extends Parent {
    public void message() {
        System.out.println("This is Second subclass");
    }
}

public class AbstractClass {
	
	public static void main(String[] args) {
		
		Parent p1= new FirstSubclass();
	    Parent p2= new SecondSubclass();

	    p1.message();
	    p2.message();
	}

}
