package com.Set.TreeSet;

import java.util.*;

public class Tracker {
	
		
	  public static void addName(HashSet<String> hset, String addName) {
			
			if(hset.add(addName)) {
				 System.out.println(addName + " added successfully.");
	       } else {
	           System.out.println(addName + " is already in the set.");
	       
			}
	}
	    public static void removeName(HashSet<String> hset, String removeName) {
		  if(hset.remove(removeName)) {
			 System.out.println(removeName + " removed successfully.");
	   } else {
	       System.out.println(removeName + "is not in the set.");
	   }
		
	}
		public static void checkNameExists(HashSet<String> hset, String checkName) {
			if(hset.contains(checkName)) {
				   System.out.println(checkName + " exists in the set.");
		       } else {
		           System.out.println(checkName + " does not exist in the set.");
		       
			   }
		}

		public static void displayAllNames(HashSet<String> hset) {
			if(hset.isEmpty()) {
				 System.out.println(" No names to display. Set is empty.");
	       } else {
	           System.out.println(" Names in the set:");
	           for (String name : hset) {
	               System.out.println(name);
	           
	           }
	       }
			
		}

		
		public static void main(String[] args) {
		    HashSet<String> hset = new HashSet<>();
		    Scanner sc = new Scanner(System.in);

		    int choice;

		    do {
		        System.out.println("Choose the Operation");
		        System.out.println("1.Add a Name");
		        System.out.println("2.Remove Name");
		        System.out.println("3.Check Name already Exists");
		        System.out.println("4.Display all Names");
		        System.out.println("5.Exit");

		        choice = sc.nextInt();
		        sc.nextLine();

		        switch (choice) {
		            case 1:
		                System.out.println("Enter the name to add:");
		                String addName = sc.nextLine();
		                addName(hset, addName);
		                break;
		            case 2:
		                System.out.println("Enter the name to remove:");
		                String removeName = sc.nextLine();
		                removeName(hset, removeName);
		                break;
		            case 3:
		                System.out.println("Enter the name to check:");
		                String checkName = sc.nextLine();
		                checkNameExists(hset, checkName);
		                break;
		            case 4:
		                displayAllNames(hset);
		                break;
		            case 5:
		                System.out.println("Exiting program. Goodbye!");
		                System.exit(0);
		                break;
		            default:
		                System.out.println("Invalid choice. Please choose a valid option.");
		        }
		    } while (true); 
		}


		
		
		
		
		}

