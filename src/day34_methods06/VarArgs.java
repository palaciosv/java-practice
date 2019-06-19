package day34_methods06;

import java.util.Arrays;

public class VarArgs {

public static void main(String[] args) {
	printWords("red", "blue");
	printWords("grey");
	printWords();//
	String[] myPets= {"Cat","dog","horse", "sheep","goat"};
	printWords(myPets);
	
	System.out.println(sum(3,5,10));
	System.out.println(sum(444,2535,6553,35454,64537,45465776,3546464,556));
	int budget=200;
	if(sum(10,45,110,39)<=budget) {
		System.out.println("Within budget");
	}else {
		System.out.println("Broke");
	}
	int total=sum(234,43,567,12,34,5);
	System.out.println("total: "+ total);
	
	cook("burrito bowl","beans","meat","salsa","sourcream");
	cook("Avocado Toast", "eggs","bacon","cheese");
}	
public static void printWords(String...words) {
	
for (String w: words) {
	System.out.println(w);

}
}


public static int sum(int...nums) {
	
	int sum = 0;
	for (int n:nums) {
		sum+=n;
	}
	return sum;
	}
	public static void cook(String name,String...ings) {
		System.out.println("Food: "+ name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shoppingList(int price, String...items) {
		
		System.out.println("Total cost: "+ price);
		System.out.println("items: "+items);
		
	}

}
