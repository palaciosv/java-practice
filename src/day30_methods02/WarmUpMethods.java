package day30_methods02;
import java.util.*;
public class WarmUpMethods {
private static Object scan;




public static void main(String[] args) {
	

	stars();
	
	//call stars 100 times
	for (int i =0; i<100;i++) {
		stars();}
		
		introduce();
	// prints 100 times
}

	public static void stars() {
		System.out.println("*****");
	}
	

public static void introduce() {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name? ");
		 String name= scan.next();
		 System.out.println("Nice to meet you"+ name);
		
}}

