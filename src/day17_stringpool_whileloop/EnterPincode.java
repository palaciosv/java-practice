package day17_stringpool_whileloop;
import java.util.*;
public class EnterPincode {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
				int secretPincode=1234;
	
	int pincode= 0;
	
	
	//keep asking for a pincode until correct one is enter
	while (pincode!=secretPincode) {
		System.out.println("Enter pincode: ");
		pincode=scan.nextInt();
	}
//access granted, select operation
	System.out.println("Access granted, select operation.");
	
	
	
	
	}
	
	
	
	
	
}
