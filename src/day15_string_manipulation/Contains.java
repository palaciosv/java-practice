package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
	String email = "test@gmail.com";
		email.contains("@");
		System.out.println(email.contains("a"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, break, cereal, meat, avocado";
		// check if apples is in the shopping list
		// if true apples are there
		//if false lets add apples now!
			//===================
	if (list.contains("apples")) {
	System.out.println("Apples are theres");
	}else {
		System.out.println("Lets add apples now!");
	}
	
	boolean hasEggs = list.contains("eggs");
	System.out.println("Contains eggs: "+ hasEggs);
	
	boolean hasCucumbers = list.contains("cucumbers");
	System.out.println("Contains cucumbers: " + hasCucumbers);
	email = "name@yahoo.com";
	if (email.contains("yahoo")) {
		System.out.println("It is yahoo email.");
	}else if(email.contains("gmail")) {
		System.out.println("It is gmail account");
	}else if(email.contains("hotmail")) {
		System.out.println("It is hotmail");
		
	}
	String etsyTitle=" Wooden Spoon | Etsy";
	if (etsyTitle.contains(" | ")){
		System.out.println("Pipe is there as expected");
		
	}else {System.out.println("Pipe is not there as expected");
	
	}
	
	String name = "Vanessa";
	if (name.contains("a") ||name.contains("e")) {
		System.out.println("'a' or 'e' is present");
	}else {
		System.out.println("'a' and 'e' are missing");
	
	}
	
	
	}
}
