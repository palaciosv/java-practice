package day37_arraylist;

import java.util.ArrayList;

public class MyCities {
public static void main (String[] args) {
	ArrayList<String>cities = new ArrayList<>();
	cities.add("Barnaul");
	cities.add("Dushanbe");
	cities.add("Sterling");
	cities.add("Baku");
	cities.add("Tashkent");
	cities.add("Baku");
	
	//print each city using for each loop seperated by space
	for(String city: cities) {
		System.out.print(city+ " ");
	}
	
	System.out.println("");
	//print each city using normal for loop, seperatedby space
	for(int i = 0;i<cities.size();i++) {
		System.out.print(cities.get(i)+ " ");
		//same thing is printed
		}
	//remove Baku
	System.out.println("Removing Baku");
	cities.remove("Baku");
	cities.remove("New York"); // it will not remove or show error

	System.out.println(cities.toString());
	//is empty?
	System.out.println("Is it empty? "+ cities.isEmpty());
	cities.add(0, "Bishkek");
	System.out.println(cities.toString());
	cities.add(0,"Istanbul");
	System.out.println(cities.toString());
	
	cities.set(2, "Seoul");
	System.out.println(cities.toString());
	//find sterlng in the list and give the index
	int idx = cities.indexOf("Sterling");
	System.out.println("Sterling index: "+ idx);
	
	cities.set(idx, "Zagreb");
	System.out.println(cities.toString());
	cities.clear();
	boolean empty= cities.isEmpty();
	//isempty method checks if its empty
	System.out.println("Empty? "+empty);
}
}
