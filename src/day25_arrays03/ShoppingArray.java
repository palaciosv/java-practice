package day25_arrays03;

public class ShoppingArray {
public static void main(String[] args) {
	String[] products = {"Timberland Shoes","H&M Shirt","Swatch Watch", "Gucci Bag","Adidas socks"}; 
	double[] prices= {120.00,5.99,150.50,3000.5,6.99};
	int[] itemsId = {12345,12346,12347,12348,12349};
	
	//print the count of products:
	System.out.println("Products count: "+ products.length);
	//check if produc, prices and items id have the same count
	//System.out.println(products.length==itemsId.length);    this works
	if(products.length==prices.length && products.length==itemsId.length) {
		System.out.println("Shopping list looks good ");
	
} else {
	System.out.println("Something is wrong in this list");
	return;
}
	//loop through product and print each one in seperate line
	
	for(String p: products) {//colon for ternary and switch and array
		
		System.out.println(p);//for each loop cannot go in reverse if you wanted it to
	}
							
	
	//prices==> for loop
	
	for (int i = 0;i<prices.length;i++) {// if you put --1 it will go in reverse
		
		System.out.println(prices[i]);
		
	}
//itemsId ==> print this in reverse order
	//print last item id
	System.out.println(itemsId[itemsId.length-1]);
	 
	//prints in reverse
	for (int b =itemsId.length-1;b>=0;b--) {
		 
		 System.out.println(itemsId[b]);
		 
		 //print a report with a total price
		 //item1:12345=timberland shoes= $120
		 //00
		 //total price is
		 System.out.println("**********You Shopping Recipt*******");
		double totalPrice=0.0;
		 for (int i = 0; i< products.length;i++) {
			System.out.println("Item " + (i+1)+" : "+ itemsId[i]+"-"+ products[i]+"- $"+prices[i]);
			
			totalPrice+=prices[i];
		}
		 
		 
		 System.out.println("Total Price: "+totalPrice);
		 //find the most expensive item in your list
		 // loop and find do not use arrays
		 int maxIndex=0;
		 double maxPrice=0;
		 //
		for(int j = 0; j<prices.length;j++) {
		if(prices[j]>maxPrice) {
			maxPrice=prices[j];
			maxIndex=j;
		}
		
	 }

	System.out.println(itemsId[maxIndex]+"-"+products[maxIndex]+"-"+prices[maxIndex]);
	
}
}}
