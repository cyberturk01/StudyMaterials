package replitMethods;

public class CountAppearsWithReturn1 {
	public static void main(String[] args) {
		String[] some_array = { "a", "foo", "bar", "foo", "bla" };
		String some_string = "foo";
		System.out.println(count_appearance(some_array, some_string));
		System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
		System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
		System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));
		System.out.println(lameDb("1tst#2bla#3foo","none","1",""));
			       
	}

	public static int count_appearance(String[] arr, String t) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == t) {
				count++;
			}
		}
		return count;
	}

	public static String lameDb(String db, String op, String id, String data) {
		String res="";
		int idNum=Integer.valueOf(id);
		String[] dbFull=db.split("#");
		
		if(op.equals("add")) {
			res=db+"#"+id+data;
		}
		if(op.equals("edit")) {
			res=db.replaceAll(dbFull[idNum-1], id+data);
		}
		if(op.equals("delete")) {
			res=db.replaceAll(dbFull[idNum-1], "");
		}
		if(op.equals("none")) {
			res=db;
		}
		return res;
	}

}
