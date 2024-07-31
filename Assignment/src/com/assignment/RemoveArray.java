package com.assignment;


// 21. WAP to remove the third element from a array list.

import java.util.ArrayList;

public class RemoveArray {
    public static void main(String[] args) {
        
        ArrayList a1 = new ArrayList();

        
        a1.add("Hii...");
        a1.add("How Are you..!!");
        a1.add("Hetal");  
        a1.add(14485);
        a1.add(43);  

        
        System.out.println("Original ArrayList: " + a1);
        System.out.println("Default size of ArrayList: " + a1.size());

        
        a1.remove(3);  

       
        System.out.println("ArrayList after removing third element: " + a1);
        System.out.println("Size of ArrayList after removal: " + a1.size());
    }
}
