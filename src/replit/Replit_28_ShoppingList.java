package replit;

import java.util.Scanner;

public class Replit_28_ShoppingList {
	  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE:
		    
		    
		    	
			String item1, item2, item3, report = null;
			
			double  price1, price2, price3, totalPrice;
			
			int count1, count2, count3;
			double item1total = 0, item2total = 0, item3total = 0;
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter Item1, count and its price: ");
			
			item1 = scan.next();
		
			count1=scan.nextInt();
			
			price1 =scan.nextDouble();
			System.out.println("Item1 is "+ item1+", count is "+ count1+", price is "+ price1);

			System.out.println("Enter Item2, count and its price: ");
			
			item2= scan.next();
			
			count2=scan.nextInt();
			price2 =scan.nextDouble();
			System.out.println("Item2 is "+ item2+", count is "+ count2+", price is "+ price2);
			
			System.out.println("Enter Item3, count and its price: ");
			
			item3 = scan.next();
			
			count3=scan.nextInt();
			
			price3 =scan.nextDouble();
			
			System.out.println(("Item3 is ") + item3+ (", count is ")+ count3+(", price is ")+ price3);
		
			String report1 ="";
			if (count1 > 0) {
				item1total = count1 * price1;
				report1=("Item1: " + item1 + "price: " + price1);
				
				
			}
			String report2 = "";
			if (count2> 0) {
				item2total = count2 * price2;
			report2="Item2: "+ item2 + ", price: " + price2;
				
			}
			
			String report3 = "";
			if (count3>0) {
				item3total = count3 * price3;
				report3="Item3: " + item3 +"price: " + price3;
				
			}
			totalPrice= item1total + item2total + item3total;
			report=report1+", "+report2+", "+report3;
			System.out.println(report);
			System.out.println("Total Price: " + totalPrice);
			//"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
		    
		    
		  }
		}

