package groceryApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpgradedGroceryApp {
	static Scanner sc=new Scanner(System.in);
	static UpgradedGroceryList groceryList=new UpgradedGroceryList();
	static boolean flag=false;
	public static void main(String[] args) {
		wannaRunAgain();
	}
	
	private static void wannaRunAgain() {
		printInstructions();
		int choice;
		try {
			while(!flag) {
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 0: 	printInstructions();		break;				
				case 1: 	printList();				break;
				case 2: 	addItem();					break;
				case 3: 	modifyItem();				break;
				case 4: 	removeItem();				break;
				case 5: 	searchItem();				break;
				case 6: 	quitApp();					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("You should enter numbers 1 to 6");
			
		}	
	}

	private static void quitApp() {
		try {
			System.out.println("System is turning off, it may take some time!");
			Thread.sleep(2000);
			System.out.println("System is closed!");
			flag=true;
		} catch (Exception e) {			
			System.out.println("There was a problem in the system!"+e.getStackTrace());
		}
		
	}
	private static void searchItem() {
		try {
			System.out.println("Enter item to search for: ");
			String item=sc.nextLine();	
			item=item.substring(0,1).toUpperCase()+""+item.substring(1).toLowerCase();
			if(groceryList.findItem(item)){
				System.out.println("Found "+ item +" in our grocery list in number :"+(groceryList.groceryList.indexOf(item)+1));
			}else {
				System.out.println("Item could not be found!");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You should enter a valid data, Empty data is not allowed!");
		}
	}
	private static void removeItem() {
		System.out.println("Enter item number that you want to delete");
		int itemNo=sc.nextInt();
		try {
			if(groceryList.removeItem(itemNo-1)) {
				System.out.println("Your item "+itemNo+" has been succesfully deleted");
			}else if(groceryList.groceryList.size()==0) {
				System.out.println("There is no data to erase in the database!");
			}	
		} catch (IndexOutOfBoundsException e) {
			  System.out.println("Invalid indexes or empty ArrayList");
		}
	}
	private static void modifyItem() {
		try {
			System.out.println("Enter item number that you want to edit:");
			int itemNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter replacement item:");
			String newItem=sc.nextLine();
			newItem=newItem.substring(0,1).toUpperCase()+""+newItem.substring(1).toLowerCase();
			if(groceryList.modifyItem(itemNo-1,newItem)) {
				System.out.println("Your item "+newItem+" has been succesfully modified");	
			}else {
				System.out.println("Invalid data entered!");
			}
		}  catch (StringIndexOutOfBoundsException e) {
			System.out.println("You should enter a valid data, Empty data is not allowed!");
		}
		
	}
	private static void addItem() {
		try {
			System.out.println("Please enter the grocery item:");
			String item=sc.nextLine();
			item=item.substring(0,1).toUpperCase()+""+item.substring(1).toLowerCase();
		
			if(groceryList.addGroceryItem(item)) {
				System.out.println("Your item "+item+" has been succesfully added");	
			}else {
				System.out.println("Please enter a valid data!");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You should enter a valid data, Empty data is not allowed!");
		}
	}
	private static void printList() {
		groceryList.printList();		
	}
	private static void printInstructions() {
		System.out.println("Press");
		System.out.println("\t0 - To print choice options.");
		System.out.println("\t1 - To print the list of grocery items.");
		System.out.println("\t2 - To add an item to the list.");
		System.out.println("\t3 - To modify an item in the list.");
		System.out.println("\t4 - To remove an item form the list.");
		System.out.println("\t5 - To search an item from the list.");
		System.out.println("\t6 - To quit the application.");
	}

}
