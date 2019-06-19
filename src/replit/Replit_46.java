package replit;
import java.util.*;
public class Replit_46 {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    int num, digit1, digit2, digit3, digit4, digit5;
		    //WRITE YOUR CODE HERE
		  
		    Scanner scan= new Scanner(System.in);
		    System.out.println("Enter your number:");
		    num = scan.nextInt();
		    String number = String.valueOf(num);
		    for(int i = 0; i < number.length(); i++) {
		        int j = Character.digit(number.charAt(i), 10);
		        System.out.println( j);
		    }
}
}