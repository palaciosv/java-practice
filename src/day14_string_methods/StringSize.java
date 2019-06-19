package day14_string_methods;

public class StringSize {
public static void main(String []args) {
	
	
	String str1 = "Good Morning";
	if (str1.contentEquals("Good Morning")){
		System.out.println("Match");
		
	}else {
		System.out.println("Not Match");
	}
	
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Math- ignore case");
		}else {
			System.out.println("Not match- ignore case");
		}
		
		//convert to ALL UPPERCASE
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);// it stays as old value not uppercase
		str1= str1.toUpperCase();
		System.out.println("After assignment: "+ str1);
		
		// combine the above methods togetther
		// conver to all lowercase first then check if it equals("good morning")
		
		if (str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("Chained methods: match");
		}else{
			System.out.println("Chained methods: do not match");
		}
		// find out how many characters in the string
			
			String myName= "Vanessa";
			
			System.out.println(myName.length());
			
			int length = myName.length();
			System.out.println("My name's length: "+ length);
			
		}
			//usernamesmust be exactly 8 characters
			// set some value and using a if statement check if it is
			// 8 characters: if tru = valid username. false = invalid username
			//must be 8 chars

			String usserName= scan.nextln();
			
			
			
			if (usaerName.length() == 8){
				System.out.println("Valid username");
			}else {
				System.out.println("invalid username");
			}
			
			
			//password must be at least 6 characters
			String password = "woodenSpoon";
			//1
			
			if(password.length()>6) {
				System.out.println("Password isgoof");
			}else { 
				System.out.println("Password is too short");
				}
			
			int passwordLength = password.length();
			if (passwordLength <=6) {
				System.out.println("invalid password, too short");
			}else {
				System.out.println("valid passwor, good");
			}
			
			
			
			
			
			}
		}


		
		
	
	
	
	
	
	
	
	
	


