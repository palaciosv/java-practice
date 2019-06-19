package replit;

import java.util.Scanner;

public class Replit_28 {
//Declare 4 String variables item1, item2, item3, report.
//-Declare double variables price1, price2, price3, totalPrice
//-Declare int variables count1, count2, count3
//-Create a Scanner object named scan.

//Execution flow using with example:

//Use scanner to read all 3 values. 

//-Display prompt "Enter Item1, count and its price:"
//Tomatoes
//2
//5.4
//Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


//-Display prompt "Enter Item2, count and its price:"
//Cheese
//0
//3.5
//Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


//-Display prompt "Enter Item3, count and its price:"
//Apples
//5
//6.3
//Explanation: (Item3 is "Apples", count is 5, price is 6.3)


//-calculate totalPrice for all items only if the item's count is more than 0!

//-build the report variable by concatenating Strings and double price values:
//-do not include items that have count 0, use if statement !
//-Calculate total price for the item and concatenate like below

//"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
//Explanation: (Item2 "Cheese" is not included since its count is 0)

//- Print the value of report variable

//- Print total Price:
//"Total price: 42.3"
//You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

	//============================================================================
	
	
	String item1, item2, item3, report;
	
	double  price1, price2, price3, totalPrice;
	
	int count1, count2, count3;
	double item1total = 0, item2total = 0, item3total = 0;
	
	Scanner scan = new Scanner (System.in);{
	
	System.out.println("Enter Item1, count and its price: ");
	
	item1 = scan.next();
	price1 =scan.nextDouble();
	
	System.out.println("Item1 is "+ item1+", count is"+ count1+", price is"+ price1);

	System.out.println("Enter Item2, count and its price: ");
	
	item2= scan.next();
	price2 =scan.nextDouble();
	System.out.println("Item2 is "+ item2+", count is"+ count2+", price is"+ price2);
	
	System.out.println("Enter Item3, count and its price: ");
	
	item3 = scan.next();
	price3 =scan.nextDouble();
	System.out.println("Item3 is " + item3+ ", count is "+ count3+", price is" + price3);
	
	String report1 =null;
	if (count1 > 0) {
		item1total = count1 * price1;
		report1="Item: " + item1 + "price: " + price1;
	}
	String report2 = null;
	if (count2> 0) {
		item2total = count2 * price2;
		report2="Item: " + item2 + "price: " + price2;
	}
	
	String report3 = null;
	if (count3>0) {
		item3total = count3 * price3;
		report3="Item: " + item3 +"price: " + price3;
	
	}
	totalPrice= item1total + item2total + item3total;
	
	System.out.println(report);
	System.out.println("Total Price: " + totalPrice);
	//"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
	

	
	
}}
