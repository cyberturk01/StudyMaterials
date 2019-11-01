package replitIFCases;

import java.util.Scanner;

public class VersicherugFirma {
	public static double premium = 0;
	public static int accidentsAmount = 0;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";

		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String license = scan.next();
		ownLicense(license);

		System.out.println("Enter your zip code");
		int zipCode = scan.nextInt();
		zipCodeCheck(zipCode);
		// scan.nextLine();

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		vehicleOwned(vehicleOwnership);

		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		vehicleUsageType(vehicleUsage);

		System.out.println("How old are you?");
		int age = scan.nextInt();
		checkAge(age);

		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool = scan.nextInt();
		dayDriven(daysDrivenToWorkOrSchool);

		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();
		milesDriven(milesToWorkOrSchool);

		System.out.println("How many years you've been driving?");
		int yearsDriving = scan.nextInt();
		checkExperiece(yearsDriving, age);
		// scan.nextLine();

		System.out.println("How you had any accidents in the last 5 years?");
		String haveAccident = scan.next();
		hadAccident(haveAccident);

		System.out.println("How you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		insurance(continuousInsurance);

		System.out.println("What is the highest level of education you have completed?");
		education = scan.next();
		levelOfEducation(education);

		System.out.println(name + " here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		referenceNumber = name.substring(0, 2) + "" + age + name.substring(name.length() - 2) + "" + zipCode + ""
				+ education.replace(" ", "");
		System.out.println("Reference number: " + referenceNumber.toUpperCase());
		scan.close();
	}

	private static void levelOfEducation(String education) {
		if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("Bachelors")
				|| education.equalsIgnoreCase("Masters")) {
			premium = premium - (premium * 0.05);
		} else if (education.equalsIgnoreCase("doctors")) {
			premium = premium - (premium * 0.1);
		} else {
			premium = premium + (premium * 0.5);
		}
	}

	private static void insurance(String continuousInsurance) {
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium *= 2;
		}
	}

	private static void hadAccident(String haveAccident) {
		if (haveAccident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + (premium * 0.2);
		}
	}

	private static void checkExperiece(int yearsDriving, int age) {
		int result = age - 16;
		if (yearsDriving < 1 || age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else {
			premium -= result * 5;
		}
	}

	private static void milesDriven(int milesToWorkOrSchool) {
		premium += milesToWorkOrSchool;
	}

	private static void dayDriven(int daysDrivenToWorkOrSchool) {
		premium += daysDrivenToWorkOrSchool * 5;
	}

	private static void checkAge(int age) {
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age >= 16) {
			premium *= 20;
		} else if (age >= 18) {
			premium *= 6;
		} else if (age > 21 || age < 25) {
			premium *= 2;
		}
	}

	private static void vehicleUsageType(String vehicleUsage) {
		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium += 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium += 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium += 20;
		}
	}

	private static void vehicleOwned(String ans) {
		if (ans.equalsIgnoreCase("owned")) {
			premium += 10;
		} else {
			premium += 20;
		}

	}

	private static void zipCodeCheck(int zipCode) {
		if (zipCode == 20910 || zipCode == 20740) {
			premium += 60;
		} else if (zipCode == 22102 || zipCode == 22103) {
			premium += 30;
		} else {
			premium += 50;
		}
	}

	private static void ownLicense(String license) {
		if (license.equalsIgnoreCase("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
	}
}
