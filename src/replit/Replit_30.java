package replit;
import java.util.Scanner;
public class Replit_30 {

//Write a program that outputs the number of hours, minutes, and seconds that
//corresponds to input total seconds. 

//-create a Scanner object
//- declare int variables inputSeconds, hours, minutes, seconds
//-Ask user enter seconds by printing:
//"Enter seconds:"

//-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
//-Assign values to the hours, minutes, seconds variables
//-Display the result.

	  public static void main(String[] args) {
		    //YOUR CODE HERE:	
     Scanner scan = new Scanner (System.in);{
	 int inputSeconds, hours, minutes, seconds;  	
	 
	 System.out.println("Enter seconds:");
	 inputSeconds= scan.nextInt();
	 hours = inputSeconds/3600;
	 minutes = inputSeconds%3600/60;
	 seconds = inputSeconds%3600%60;
	 
	 System.out.println(hours + " hours, "+ minutes + " minutes, " + seconds + " seconds");
	 
		    	
		    	
		    	
     }
 }
}
