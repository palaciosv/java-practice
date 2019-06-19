package day40_CustomClasses_Methods;

public class MyContacts {
	public static void main(String[] args) {
		//create Contace object
	Contact contact1 = new Contact();
	contact1.name="Evgenia Jalilova";
	contact1.phoneNumber="(202)-333-444";
	contact1.email="Evgenia@thorlabs.com";
	
	contact1.Call();
	contact1.sendMessage();
	contact1.sendEmail();
	
	
	Contact Orhan= new Contact();
	Orhan.name="Orhan Sultanov";
	Orhan.phoneNumber= "(571)-991-3322";
	Orhan.email="Orhan@google.com";

		System.out.println("Name: "+ Orhan.name);
		System.out.println("Phone Number: "+Orhan.phoneNumber);
		System.out.println("Email: "+ Orhan.email);
	
	Orhan.Call();
	Orhan.sendMessage();
	Orhan.sendEmail();
	
	
	}
}
