package day29_method01;

import java.util.Arrays;

public class Countries {
public static void main(String[] args) {
	String[][] CountriesArray ={
				{"USA"	,"Washington DC"},
				{"Canada",	"Ottawa"},
				{"Mexico",	"Mexico city"},
				{"Brasil",	"Brasilia"},
				{"Peru"	,"Lima"},
				{"Argentina"	,"Buenos Aires"},
				{"Bolivia",	"La Paz"},
				{"Macedonia",	"Scopia"},
				{"Kazakhstan",	"Nursultan"}};
//String [][]c= new String [9][2];
	//c[0][0]="USA"
	//C[0][1]="Washington Dc"
	
	
	//same thing but doing it one by one
	
	System.out.println(CountriesArray[0][1]+","+ CountriesArray[0][0]);// washington Dc, 
	
	System.out.println(CountriesArray[8][0]+","+CountriesArray[8][1]);//kazakhstan, nursultan
	
	//print everything in one statement
	System.out.println(Arrays.deepToString(CountriesArray));
	
	//print all the countries in the same line seperated by ","
	
	for(int i=0;i<CountriesArray.length;i++) {
		System.out.print(CountriesArray[i][0]+",");
		//i starts at 0 so it will continue all the way down
		
	}
	System.out.println();// line before has print instead
	// of println so we need empty printout to skip to next line
	
	
	//same thing with for each loop
	//always need colon
	//array on right side
	
	for(String[] country:CountriesArray) {
		System.out.print(country[0]+",");
	}
	System.out.println();
	//get all the Cities[] and add to Array
	//declare cities array and size needs to match countriesArray
	String[] cities = new String[CountriesArray.length]; 
	for(int i=0;i<CountriesArray.length;i++) {
	cities[i]=CountriesArray[i][1];
	
	
}
		System.out.println(Arrays.toString(cities));
		
		//look for bolivia in the CountrieArray and see if the capital city is la paz
		for(int row=0; row<CountriesArray.length;row++) {
			if (CountriesArray[row][0].equals("Bolivia")) {
				System.out.println(CountriesArray[row][1]);
			if(CountriesArray[row][1].equals("La Paz")) {
				System.out.println("Bolivia passed");
			}else {
				System.out.println("Bolivia test failed");
			}	
			break;//exit the loop
		}
		
	}
}}
