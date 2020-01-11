package replitMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
	/*
	 * Create a static method that: is called combineAL returns an ArrayList takes
	 * two parameters: an ArrayList of Strings called wordList1, and an ArrayList of
	 * Strings called wordList2
	 * 
	 * This method should create a new ArrayList of Strings, add all the words (in
	 * order) from wordList1, then add all the words (in order) from wordList2. In
	 * other words, it is combining all the elements from the two parameters.
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> wordList1 = new ArrayList<String>();
		ArrayList<String> wordList2 = new ArrayList<String>();
		wordList1.add("Ali1");
		wordList1.add("Ali2");
		wordList1.add("Ali3");
		wordList2.add("Ali4");
		wordList2.add("Ali5");
		wordList2.add("Ali6");
		for (int i = 0; i < wordList1.size() + wordList2.size(); i++) {
			System.out.println(combineAL(wordList1, wordList2).get(i));
		}
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo", "yo"));
//		removeAll(wordList, "hi");
		removeAll(wordList, "yo");
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}

	}

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> newList = new ArrayList<String>();
		for (int j = 0; j < wordList1.size(); j++) {
			newList.add(wordList1.get(j));
		}
		for (int j = 0; j < wordList2.size(); j++) {
			newList.add(wordList2.get(j));
		}
		return newList;
	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals(targetWord)) {
				wordList.remove(targetWord);
			}
		}
	}

}
