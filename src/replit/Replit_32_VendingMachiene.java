package replit;
import java.util.*;
public class Replit_32_VendingMachiene {

	public static void main(String[] args) {
		
	
	//ENTER CODE HERE
	     int itemPrice;
	     int quarters =25;
	     int dimes = 10;
	     int nickels=5;
	     
	     Scanner scan= new Scanner(System.in);
	     
	   System.out.println("Enter price in cents:");
	   itemPrice=scan.nextInt();
	   
	   if(itemPrice<24) {
	 	  System.out.println("Invalid price!");
	 	  return;
	 } if (itemPrice>100) {
	 	System.out.println("Invalid price!");
	 	return;
	 }if(itemPrice % 5 != 0) {
	   System.out.println("Invalid price!");
	 return;}
	   
	 itemPrice=100-itemPrice;
	   if(itemPrice%25>=0) {
	 	  quarters=itemPrice/25;
	 	  itemPrice=itemPrice%25;
	   if(itemPrice%10>=0) {
	 	  dimes=itemPrice/10;
	 	  itemPrice=itemPrice%10;
	 if (itemPrice%5>=0) {
	 	nickels=itemPrice/5;
	 }}
	 System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
	 }}}
