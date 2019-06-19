package day40_CustomClasses_Methods;

import java.util.*;

public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String>myList= new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		
		String targetWord = "Sun";
		int count = countOccurences(myList,targetWord);
		if(count==3){
			System.out.println("Unit test pass: Count is 3");
		}else {
			System.out.println("Unit test fail");
		}
	}
	

//return int
	//params ArrayList<String>, String word
	//methods counts how many times, word appears in the list,
	//and returns the count
	
	//[aa,aa,bb,jj,yy]
public static int countOccurences(ArrayList <String>list, String word) {
	int count=0;
	
	for(String str: list) {
		if(str.equals(word)) {
			count++;
		}
	}
	return count;
}
}