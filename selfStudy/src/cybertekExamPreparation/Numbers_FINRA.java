package cybertekExamPreparation;

import java.util.Arrays;

public class Numbers_FINRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FINRA3();
	}

	public static void FINRA1() {
		String result = "";
		for (int i = 1; i <= 30; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				result += "FINRA ";
			else if (i % 5 == 0)
				result += "RA ";
			else if (i % 3 == 0)
				result += "FIN ";
			else
				result += i + " ";
		}
		System.out.println(result);
	}

	public static void FINRA2() {
		String result = "";
		for (int i = 1; i <= 30; i++) {
			result += (i % 5 == 0 && i % 3 == 0) ? "FINRA " : (i % 5 == 0) ? "RA " : (i % 3 == 0) ? "FIN " : i + " ";
		}
		System.out.println(result);
	}

	public static void FINRA3() {
		String[] myarr = new String[30];
		for (int i = 0; i <= 29; i++)
			myarr[i] = "" + (i + 1);

		for (int j = 0; j < myarr.length; j++)
			if (Integer.valueOf(myarr[j]) % 3 == 0 &&  Integer.valueOf(myarr[j]) % 5 == 0)
				myarr[j] = "FINRA";
			else if (Integer.valueOf(myarr[j]) % 3 == 0)
				myarr[j] = "FIN";
			else if (Integer.valueOf(myarr[j]) % 5 == 0)
				myarr[j] = "RA";
		
		System.out.println(Arrays.toString(myarr));
	}

}
