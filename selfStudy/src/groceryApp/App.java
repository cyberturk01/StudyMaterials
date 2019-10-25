package groceryApp;

import java.util.Scanner;

public class App {
	static GroceryList groceryList=new GroceryList(); // Object olusturma
	static Scanner sc=new Scanner(System.in);
	static boolean flag=false;
	public static void main(String[] args) {
		
		int choice=0;
		printInstructions();
		do {
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			sc.nextLine(); // bunu koymayi unutma
			switch (choice) {
			case 0:		printInstructions();    break;
			case 1:		printGroceryList();    	break;
			case 2:		addItem(); 				break;
			case 3:		modifyItem(); 			break;
			case 4:		removeItem();    		break;
			case 5:		searchItem();		    break;
			case 6:		quitApp();    			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(!flag);
		
	}
	public static void quitApp() {
		flag=false;
	}
	public static void searchItem() {
		System.out.println("Enter an Item to search for: ");
		String item=sc.nextLine();
		
		if(groceryList.findGroceryList(item)!=null) {
			System.out.println("Found "+ item+" in our grocery List.");
		}else {
			System.out.println(item+" is not in our grocery List.");
		}
	}
	public static void removeItem() {
		System.out.println("Enter item no to remove: ");
		int itemNo=sc.nextInt();
		groceryList.removeGroceryList(itemNo-1);
	}
	public static void modifyItem() {
		System.out.println("Enter item number to modify: ");
		int itemNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem=sc.nextLine();
		groceryList.modifyGroceryList(itemNo-1, newItem);
	}
	public static void addItem() {
		System.out.println("Please enter the grocery item to add: ");
		String itemName=sc.nextLine();
		groceryList.addGroceryList(itemName);
	}
	public static void printGroceryList() {
		groceryList.printGroceryList();
	}
	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t0 - To print choice options.");
		System.out.println("\t1 - To print the list of grocery items.");
		System.out.println("\t2 - To add an item to the list.");
		System.out.println("\t3 - To modify an item in the list.");
		System.out.println("\t4 - To remove an item form the list.");
		System.out.println("\t5 - To search an item from the list.");
		System.out.println("\t6 - To quit the application.");
	}

}
