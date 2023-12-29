package com.Queue.Stack;

import java.util.Stack;
//5. WAP to check if a Stack has values:
public class CheckIfStackHasValues {
	    public static void main(String[] args) {
	        Stack<String> stack = new Stack<>();
	        stack.push("Value");

	        if (!stack.isEmpty()) {
	            System.out.println("Stack has values.");
	        } else {
	            System.out.println("Stack is empty.");
	        }
	    }
}
