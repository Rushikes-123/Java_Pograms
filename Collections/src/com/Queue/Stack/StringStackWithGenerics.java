package com.Queue.Stack;

import java.util.Stack;
//2. WAP to create a Stack with some colors (String) 
//& using generics:
public class StringStackWithGenerics {
	 public static void main(String[] args) {
	        Stack<String> stack = new Stack<>();
	        stack.push("Red");
	        stack.push("Green");
	        stack.push("Blue");

	        System.out.println("Stack elements: " + stack);
	    }
}
