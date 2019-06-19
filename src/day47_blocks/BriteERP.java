package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	static {//automatically runs in the beginning
		System.out.println("Launch Browser");
		System.out.println("Navigate to: "+ TestData.url);
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: "+TestData.email);
		
	}
	
	public static void enterPassword() {
		System.out.println("Enter Password: "+TestData.password);
		
	}
	public static void verifyLogin() {
		System.out.println("Expected Name: "+TestData.userName);
		System.out.println("Actual name displayed: Viktoriia Lugovska");
		System.out.println("Login successful-"+LocalDateTime.now());
	}
}
