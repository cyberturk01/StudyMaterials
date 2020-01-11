package replitMethods;

public class CoverStrings {
	public static void main(String[] args) {
		System.out.println(coverString("[hi]", "hi"));
		System.out.println(coverString("java methods", "me"));
		System.out.println(coverString("Certified Wooden Spoon", "o"));
		
	}

	public static String coverString(String main, String coverME) {
		String res = "";
		if (main.indexOf(coverME) > -1) {
			res = main.replaceAll(coverME, "[" + coverME + "]");
		} else if (main.contains("[]")) {
			res = "[[" + coverME + "]]";
		} else {
			res = main;
		}
		return res;
	}


}
