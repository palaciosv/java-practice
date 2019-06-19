package OfficeHour14_may21;

public class Employees {
public static void main(String[] args) {
	EmailGenerator e1= new EmailGenerator("Roman");
	System.out.println(e1.getEmail());
	
	EmailGenerator e2= new EmailGenerator("Florian");
	System.out.println(e2.getEmail());
	
	EmailGenerator.companyName="shmeloitte";
	//both object will have different company name
	// in the email because the value of the static variable applies to all objects
	System.out.println(e1.getEmail());
	System.out.println(e2.getEmail());
}
}
