package groceryApp;

import java.util.ArrayList;

public class GroceryList {
	ArrayList<String> groceryList= new ArrayList<String>();
	
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list.");
		for(int i=0;i<groceryList.size(); i++) {
			System.out.println(i+1 +". "+groceryList.get(i));
		}
	}
	public void addGroceryList(String item) {
		groceryList.add(item);	
		System.out.println("Grocery Item "+ (item) +" has been added.");
	}
	public void modifyGroceryList(int item, String newItem) {
		groceryList.set(item, newItem);
		System.out.println("Grocery Item "+ (item+1) +" has been modified.");
	}
	public void removeGroceryList(int item) {
		groceryList.remove(item);
		System.out.println("Grocery Item "+ (item+1) +" has been removed.");
	}
	public String findGroceryList(String item) {
		int position=groceryList.indexOf(item);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
}
