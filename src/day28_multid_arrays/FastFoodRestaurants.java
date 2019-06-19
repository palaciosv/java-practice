package day28_multid_arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		//add throw to main
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

	System.out.println("Date size: "+ data.length);
	// print first row
	System.out.println(data[0]);
	System.out.println(data[1]);
	//print last restaurant
	System.out.println(data[data.length-1]);// last data
	
	//System.out.println(Arrays.toString(data));
	//=======
	//print each Restaurant information in separate lines
	int counter = 0;
	
	for(String restaurant: data) {
		System.out.println("#" + counter+"=>"+restaurant);
		counter++;
	}
	System.out.println("=======================================");
	System.out.println("=======================================");
	System.out.println("=======================================");
	System.out.println("=======================================");
	//print all restaurant info in the state of VA
	//also count and print the number
	int countVA=0;
for (String row: data) {
	if (row.contains(",VA,")) {
		System.out.println(("#" + countVA+"=>"+row));
		countVA++;
		}
	}
	
	System.out.println("Total VA restaurants:"+ countVA);	
	// find all restaurants in state of VA
	//print restaurant names along with city name
	//subway-Herndon
	
		
	
	for (String res: data) {
		if (res.contains(",VA,")) {
			String [] resArr = res.split(",");
			System.out.println(resArr[2]  + "-" + resArr[1]);
		}
	}
	
	
	}
}