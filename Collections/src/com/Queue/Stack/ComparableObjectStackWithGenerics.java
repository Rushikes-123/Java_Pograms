package com.Queue.Stack;
 import java.util.Stack;
//6. WAP to create a Stack using generics and add user-defined
// class objects that implement the Comparable interface:
	class Person implements Comparable<Person> {
	    String name;

	    Person(String name) {
	        this.name = name;
	    }

	    @Override
	    public int compareTo(Person other) {
	        return this.name.compareTo(other.name);
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	}

	public class ComparableObjectStackWithGenerics {
	    public static void main(String[] args) {
	        Stack<Person> stack = new Stack<>();
	        stack.push(new Person("Ram"));
	        stack.push(new Person("Seeta"));
	        stack.push(new Person("Vikas"));

	        System.out.println("Original Stack: " + stack);

	        while (!stack.isEmpty()) {
	            System.out.println("Removed: " + stack.pop());
	        }
	    }
	

}
