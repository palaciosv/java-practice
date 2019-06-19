package replit;
import java.util.Scanner;
public class Replit_24 {

	
	
	  public static void main(String[] args) {
	    //Enter your code here
	  
	   
		  Scanner scan = new Scanner(System.in);
		    
		  String firstName;
		  String lastName;
		  String  email;
		  String street;
		  String state;
		  String city;
		  String address;
		  String contacts;
		 
	    int age;
	    int zipcode;
	    double height;
	    double weight;
	    boolean isMarried = true;
	    long workPhoneNumber;
	    long personalPhoneNumber;
	    
	    
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personl information");
	    System.out.println("Enter your first name");
	    firstName = scan.nextLine();
	    System.out.println ("Enter your last name");
	    lastName = scan.nextLine();
	    System.out.println("Enter your email");
	     email = scan.nextLine();
	    System.out.println("Enter your street")	;
	     street = scan.nextLine();
	    System.out.println("Enter your city");
	     city = scan.nextLine();
	    System.out.println("Enter your state");
	     state = scan.nextLine();
		 System.out.println("Enter your zip code");
		 zipcode = scan.nextInt();
		 System.out.println("Enter your work phone number");   
		 workPhoneNumber = scan.nextLong();
		 System.out.println("Enter your personal phone number");
		 personalPhoneNumber = scan.nextLong();
		 System.out.println("Enter your age");
		 age = scan.nextInt();
		 System.out.println("Enter your height");
		 height = scan.nextDouble();
		 System.out.println("Enter your weight");
		 weight = scan.nextDouble();
		 System.out.println("Are you married?");
		 
		 
		 System.out.println("Patiend personal information");
		 String fullName = (firstName +", " + lastName);
		 String addresS = (street+","+ city+","+ state + zipcode);
		 String contactS =("work phone number - "+workPhoneNumber);
		 System.out.println("Height: "+ height);
		 System.out.println("Weight: "+ weight +" pounds");
		 
		 System.out.println("Married?: "+ isMarried);
		 

		 //
		// -build contacts variable by concatenating work phone, personal phone and email
		 //-build fullName variable by concatenating first name and last name
		 //-build address variable by concatenating street, city, state, zip code

		 //this is should be an output in the console (terminal)

		// Patient personal information
		 //Full name: May, James
		 //Address: 7925 Jones Branch Dr, McLean, VA 22102
		 //Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
		// Age: 35
		 //Height: 5.1
		// Weight: 173.2 pounds
		 //Married?: true

	  
	  
	  
	  }}
