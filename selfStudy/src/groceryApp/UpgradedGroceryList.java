package groceryApp;

import java.util.ArrayList;

public class UpgradedGroceryList {
	ArrayList<String>groceryList= new ArrayList<>();
	
	public boolean addGroceryItem(String item) {
		if(!(item.equalsIgnoreCase(""))) {
			groceryList.add(item);
			return true;
		}
		return false;
	}

	public void printList() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list");
		for (int i=0;i< groceryList.size();i++) {
			System.out.println((i+1)+". "+ groceryList.get(i));
		}
	}

	public boolean modifyItem(int itemNo, String newItem) {
		if(itemNo>0 && !(newItem.equalsIgnoreCase(""))) {
			groceryList.set(itemNo, newItem);	
			return true;
		}
		return false;
	}

	public boolean removeItem(int itemNo) {
		if(itemNo>0) {
			groceryList.remove(itemNo);
			return true;
		}
		return false;
	}

	public boolean findItem(String item) {
		if(groceryList.indexOf(item)>-1) {
			return true;
		}
		return false;
	}
	
}
