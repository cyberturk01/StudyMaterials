package replitMethods;

public class UniqueCharachters {
	public static void main(String[] args) {
		System.out.println(uniqueChars("wooden-spoon"));// woden-spn;
		System.out.println(uniqueChars("java"));// jav
		System.out.println(uniqueChars("spoon"));// spon
	}
	public static String uniqueChars(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (res.indexOf(current) < 0) { // current baslangicta -1 yoksa ekle var ise ekleme
				res = res + current;
			}
		}
		return res;
	}
}
