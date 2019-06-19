package day38_arraylist03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSoting {
public static void main(String[] args) {
	List<Integer>numsList = new ArrayList<>();
	numsList.add(44);
	numsList.add(1);
	numsList.add(4);
	numsList.add(1000);
	numsList.add(3);
	System.out.println(numsList);
	
	System.out.println("Sorting ...please...wait:");
	Collections.sort(numsList);
	System.out.println(numsList);
	
	List<String> strList = new ArrayList<>();
	strList.add("Fuad");
	strList.add("murad");
	strList.add("Maria");
	strList.add("Dina");
	strList.add("Bojan");
	System.out.println(strList);
	System.out.println("Sorting pleasewait.........");
	Collections.sort(strList);
	System.out.println(strList);
	//MAX,MIN
	int maxName= Collections.max(numsList);
	int minName=Collections.min(numsList);
	
	
}
}
