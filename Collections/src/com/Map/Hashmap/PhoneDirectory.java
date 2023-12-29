package com.Map.Hashmap;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class PhoneDirectory {
	    public Map<String, String> phoneMap= new HashMap<>();

	    public PhoneDirectory() {
	        this.phoneMap =phoneMap;
	    }

	    public void addContact(String name, String phoneNumber) {
	        phoneMap.put(name, phoneNumber);
	        System.out.println("Contact added successfully!");
	    }

	    public void removeContact(String name) {
	        if (phoneMap.containsKey(name)) {
	            phoneMap.remove(name);
	            System.out.println("Contact removed successfully!");
	        } else {
	            System.out.println("Contact not found.");
	        }
	    }

	    public String getPhoneNumber(String name) {
	        return phoneMap.getOrDefault(name, "Contact not found");
	    }

	    public void displayDirectory() {
	        System.out.println("Phone Directory:");
	        for (Map.Entry<String, String> entry : phoneMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        PhoneDirectory phoneDirectory = new PhoneDirectory();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Remove Contact");
	            System.out.println("3. Retrieve Phone Number");
	            System.out.println("4. Display Directory");
	            System.out.println("5. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter name:");
	                    String addName = sc.nextLine();
	                    System.out.println("Enter phone number:");
	                    String addPhoneNumber = sc.nextLine();
	                    phoneDirectory.addContact(addName, addPhoneNumber);
	                    break;
	                case 2:
	                    System.out.println("Enter name to remove:");
	                    String removeName = sc.nextLine();
	                    phoneDirectory.removeContact(removeName);
	                    break;
	                case 3:
	                    System.out.println("Enter name to retrieve phone number:");
	                    String retrieveName = sc.nextLine();
	                    String phoneNumber = phoneDirectory.getPhoneNumber(retrieveName);
	                    System.out.println("Phone number: " + phoneNumber);
	                    break;
	                case 4:
	                    phoneDirectory.displayDirectory();
	                    break;
	                case 5:
	                    System.out.println("Exiting Phone Directory application. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


