package cybertekExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RemoveAhmed {
	public static void main(String[] args) {

	}

	public static void remove() {
		ArrayList<String> names;
		names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		names.removeAll(Arrays.asList("Ahmed"));
		System.out.println(names);
	}

	public static void remove2() {
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		for (ListIterator<String> it = names.listIterator(); it.hasNext();)
			if (it.next().equals("Ahmed"))
				it.remove();
		System.out.println(names);
	}

	public static void remove3() {
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		List<String> names2 = new ArrayList<>();

		names.forEach(p -> {
			if (p.equals("Ahmed"))
				names2.add(p);
		});

		System.out.println(names2);
	}

	public static void remove4() {
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			if (it.next().equals("Ahmed"))
				it.remove();
		}
		System.out.println(names);
	}
}
