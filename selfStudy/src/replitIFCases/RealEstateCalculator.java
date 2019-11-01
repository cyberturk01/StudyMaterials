package replitIFCases;

import java.util.Scanner;

public class RealEstateCalculator {

	public static Scanner scan = new Scanner(System.in);
	public static int propertyPrice=0;
	public static void main(String[] args) {
		
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		
		printStart();
		
		System.out.println("Enter your property type:");
		houseType=scan.nextLine();
		houseType(houseType);
		
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms=scan.nextInt();
		bedrooms(numberOfBedrooms);	   
	
	    System.out.println("Do you have a backyard?");
	    backyard=scan.nextBoolean();
	    backyard(backyard, houseType);
		
	    System.out.println("Do you have garage?");
	    garage=scan.nextBoolean();
	    System.out.println("How many spots?");  
	    garageSpots=scan.nextInt();
		garage(garage,garageSpots);
	    
	    System.out.println("How close is metro station?");   
	    metroAccessibility=scan.nextFloat();
	    accesibilty(metroAccessibility);
	    
	    System.out.println("How close is highway?");   
	    highwayAccessibility=scan.nextFloat();
	    highAccesibility(highwayAccessibility);
	    
	    System.out.println("What's the rating of nearest school?");   
	    schoolScore=scan.nextFloat();
	    school(schoolScore);    
	    
	    System.out.println("Does any of your family members smoking?"); 
	    smoking=scan.nextBoolean();
	    smoking(smoking);
	    
	    System.out.println("Market report has been generated.");   
	    System.out.println("Your estimate market price is: "+propertyPrice+"$");   
	    
	    scan.close();
	}
	public static void printStart() {
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
	}
	public static void houseType(String houseType) {
		 if(houseType.equals("Condo")){
		      propertyPrice=50000;
		    }else if(houseType.equals("Townhouse")){
		      propertyPrice=75000;
		    }else if(houseType.equals("Single Family Home")){
		      propertyPrice=95000;
		    }else{
		      System.out.println("Invalid value");
		  }
	}
	public static void bedrooms(int numberOfBedrooms) {		
	    propertyPrice=propertyPrice+(numberOfBedrooms*30000);    
	}
	public static void backyard(boolean backyard, String houseType) {
	    if(backyard){
		      if(!(houseType.equals("Condo"))){
		        propertyPrice+=5000;  
		      }else{
		        System.out.println("Backyard is not available for condo!");   
		      }
		 }
	}
	public static void garage(boolean garage, int garageSpots) {
		  if(garage){
		      if(garageSpots>10){
		        System.out.println("Pardon, it's not a public parking!");  
		      }else{
		        propertyPrice+=(garageSpots*20000);  
		      }
		  }
	}
	public static void accesibilty(float metroAccessibility) {
		if(metroAccessibility<=1){
		      propertyPrice+=10000;
		}else if(metroAccessibility>1 && metroAccessibility<=3){
		      propertyPrice+=5000;
		}
	}
	public static void highAccesibility(float highwayAccessibility) {
	    if(highwayAccessibility<=1){
		      propertyPrice+=15000;
		    }else if(highwayAccessibility>1 && highwayAccessibility<=5){
		      propertyPrice+=8000;
		    }else if(highwayAccessibility>5 && highwayAccessibility<=20){
		      propertyPrice+=4000;
		    }
	}
	public static void school(float schoolScore) {
		if(schoolScore>=8 && schoolScore<=10){
		      propertyPrice+=45000;
		    }else if(schoolScore>4 && schoolScore<8){
		      propertyPrice+=20000;
		    }else{
		      propertyPrice+=5000;
		    }
	}
	public static void smoking(boolean smoking) {		 
		    if(smoking){
		      propertyPrice-=5000;
		    }
	}

}
