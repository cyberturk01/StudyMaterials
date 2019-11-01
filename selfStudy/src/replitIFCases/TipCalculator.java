package replitIFCases;

import java.util.Scanner;

public class TipCalculator {
	  public static void main(String[]arg){
  		Scanner sc= new Scanner(System.in);
		System.out.println("Split:");
//		String split = sc.nextLine();
		System.out.println("Number of people:");
		int noPeople = sc.nextInt();
		System.out.println("Check amount:");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Service Quality:");
		String sQ = sc.nextLine();
		double total = amount + tipPercent(sQ, amount);
		System.out.println("Number of people entered: " + numberOfPeople(noPeople));
		System.out.println("Total to pay: " + total);
		System.out.println("Total tip: " + (tipPercent(sQ, amount)));
		System.out.println("Total per person: " + (total / noPeople));
		System.out.println("Tip per person: " + (tipPercent(sQ, amount) / noPeople));
		sc.close();

	}

	public static String numberOfPeople(int noPeople) {
		String people = "";
		for (int i = 0; i < noPeople; i++) {
			people += "&";
		}
		return people;
	}

	public static double tipPercent(String service, double amount) {
		double result = 0;
		if (service.equals("Poor")) {
			result = (amount * 0.05);
		}
		if (service.equals("Fair")) {
			result = (amount * 0.10);
		}
		if (service.equals("Good")) {
			result = (amount * 0.15);
		}
		if (service.equals("Great")) {
			result = (amount * 0.20);
		}
		if (service.equals("Excellent")) {
			result = (amount * 0.25);
		}
		return result;
	}
}
