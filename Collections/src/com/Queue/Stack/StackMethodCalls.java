package com.Queue.Stack;

import java.util.Stack;
//4. Use different method calls to add elements to a Stack:
public class StackMethodCalls {
	  public static void main(String[] args) {
	        Stack<String> stack = new Stack<>();
	        stack.push("One");
	        stack.add("Two");
	        stack.addElement("Three");

	        System.out.println("Stack elements: " + stack);
	    }
}
