package com.assignment;

// 18. WAP to create one thread by extending Thread class in another Class

class First extends Thread {
    public void run() {
        System.out.println("I am a Software Tester.");
    }
}

public class ExtendingThread {
	public static void main(String[] args) {
		
		 First fc = new First();

	        // Start the thread
	        fc.start();

	        // Main thread continues execution
	        System.out.println("My name is Hetal.");
	}

}