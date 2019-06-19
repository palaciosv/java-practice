package replit;
import java.util.*;
public class Rplit_34_video {
	  public static void main(String[] args) {
		    //Write your code here
		    
		    Scanner scan = new Scanner (System.in);{
		    int coupons=0;
		    int candies=0;
		    int gumball=0;
		    System.out.println("Enter number of coupons:");
		    coupons=scan.nextInt();
		    if (coupons<3){
		      System.out.println("Not enough coupons");
		    } 
		    if((coupons%10)>=0){
		    	candies=coupons/10;
		      coupons= coupons%10;
		    
		    System.out.println("Number of Candies: "+candies);
		    if((coupons%3)>=0){
		     
		      gumball=coupons/3;
		     
		    }
		
		    System.out.println("Number of Gumballs: "+ gumball);
		    }
		    
		  }

		}}

