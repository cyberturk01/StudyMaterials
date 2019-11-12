package codingBat;

import java.util.ArrayList;
import java.util.List;

public class NoXFunctional {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("ax");
		list.add("bb");
		list.add("cx");
		list.add("cd");
		System.out.println(noX(list));
		
		
//		 noX(["ax", "bb", "cx"]);
	}
	public static List<String> noX(List<String> strings) {
		  strings.replaceAll(n->n.replace("x", ""));
		  return strings;
	}


}
