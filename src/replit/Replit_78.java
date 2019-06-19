package replit;

import java.util.Scanner;

public class Replit_78 {
	public static void main (String [] args) {
	    
			    //DO NOT CHANGE
			    double premium = 0;
					int accidentsAmount = 0;
					int daysDrivenToWorkOrSchool = 0;
					int milesToWorkOrSchool = 0;
					String vehicleOwnership = "";
					String vehicleUsage = "";
					String continuousInsurance = "";
					String education = "";
					String name = "";
					String referenceNumber = "";
					Scanner scan = new Scanner(System.in);
					System.out.println("Welcome to the CountyFarm car insurance!");
			    //WRITE YOUR CODE HERE
						System.out.println("Enter your name"); 
						   name = scan.nextLine();
						   System.out.println("Do you have a US driver license?");
						   String license = scan.next();
						   if(license.equals("No")){
						     System.out.println("Invalid data!");
						   
						    System.exit(0);
						   }else{
						   
						    
						System.out.println("Enter your zip code");
						int zip = scan.nextInt();
						if(zip==20910 || zip==20740) {
						                  premium+=60;
						                  
						 }else if(zip == 22102 || zip==22103) {
						             premium +=30;
						   }else {
						              premium +=50;
						          }

						      System.out.println("Is this vehicle Owned, Financed, or Leased?");
						      vehicleOwnership = scan.next();
						      if(vehicleOwnership.equals("Owned")) {
						          premium+=10;
						          
						      }else{
						          premium+=20;
						      }
						      System.out.println("How is this vehicle primarily used?");
						      vehicleUsage = scan.next();
						      if(vehicleUsage.equals("Business")) {
						          premium+=50;
						      }else if(vehicleUsage.equals("Pleasure")) {
						          premium+=10;
						      }else if (vehicleUsage.equals("Commute")) {
						          premium+=20;}
						          System.out.println("Days Driven To Work And/Or School");
						          daysDrivenToWorkOrSchool = scan.nextInt();
						        premium += daysDrivenToWorkOrSchool*5;
						      
						          System.out.println("Miles Driven To Work And/Or School");
						          milesToWorkOrSchool = scan.nextInt();
						          premium += milesToWorkOrSchool;
						          

							      System.out.println("How old are you?");
							     int age = scan.nextInt();
							      if(age<16) {
							          System.out.println("Invalid data!");
							           System.exit(0);
							      }else if(age>16 && age<18) {
							          premium  = premium *20;
							         
							      }else if(age>=18 && age<=21) {
							          premium  = premium *6;
							      }else if(age>21 && age<25) {
							          premium  = premium *2;
							      }
							System.out.println("What is your driving experience?");
							int drivingExperience = scan.nextInt();

							if(drivingExperience==0 || age - drivingExperience<16) {
							    System.out.println("Invalid data!");
							    System.exit(0);
							}else {
							    System.out.println("Have you had any accidents in last 5 years?");
							    String oops = scan.next();
							
							    if(oops.equals("Yes")|| oops.equals("YES") ) {
							    	System.out.println("How many?");
							    
							        accidentsAmount =scan.nextInt();
							        premium+=premium*accidentsAmount*0.2;
							    }}
							    System.out.println("Have you had continuous insurance for the past 12 months?");
							    continuousInsurance = scan.next();
							    if(continuousInsurance.equals("no")|| continuousInsurance.equals("NO")) {
							        premium*=2;
							    }
							    System.out.println("What is the highest level of education you have completed?");
							    education = scan.nextLine();
							    if(education.equals("PhD")||education.equals("Bachelors") || education.equals("Masters")) {
							        premium*=0.95;
							    }else if(education.equals("Doctors")) {
							        premium*=0.9;
							    }else if(education.equals("Less than High School")) {
							        premium*=1.05;
							    }
							        
							    System.out.println(name+", here's your quote!");
							    System.out.println("Start Your Policy Today For: $"+premium);
							   referenceNumber= name.substring(0,1)+age+ name.substring(name.length()-2,name.length() - 1)+zip+education; 
							    System.out.println("Reference number: "+  (referenceNumber.toUpperCase()));
							
							    }
							   
							   
						   
						}}
						    
				  

