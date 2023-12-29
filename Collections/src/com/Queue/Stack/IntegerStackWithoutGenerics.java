package com.Queue.Stack;

import java.util.Stack;
//1. WAP to create a Stack with Integer objects 
//without using generics:
	public class IntegerStackWithoutGenerics {
	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Stack elements: " + stack);
	    }
	}


