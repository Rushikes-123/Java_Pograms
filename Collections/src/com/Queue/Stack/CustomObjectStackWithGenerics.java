package com.Queue.Stack;
//3. WAP to create a Stack with user-defined class 
//objects & using generics:
import java.util.Stack;

	class Student {
	    String name;

	    Student(String name) {
	        this.name = name;
	    }

		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}
	}

	public class CustomObjectStackWithGenerics {
	    public static void main(String[] args) {
	        Stack<Student> stack = new Stack<>();
	        stack.push(new Student("Ram"));
	        stack.push(new Student("Neha"));

	        System.out.println("Stack elements: " + stack);
	    }
	

}
