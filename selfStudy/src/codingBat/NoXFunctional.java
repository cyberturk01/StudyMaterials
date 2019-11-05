package codingBat;

import java.util.List;

public class NoXFunctional {

	public static void main(String[] args) {
		System.out.println();
//		 noX(["ax", "bb", "cx"]);
	}
	public List<String> noX(List<String> strings) {
		  strings.removeIf(n->n.contains("x"));
		  return strings;
	}


}
