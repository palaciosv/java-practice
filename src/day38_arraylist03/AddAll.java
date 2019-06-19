package day38_arraylist03;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
public static void main(String[] args) {
	List<String> l1= new ArrayList<>();
	l1.add("Java");
	l1.add("Python");
	
	List<String>l2 = new ArrayList<>();
	l2.add("C#");
	l2.add("c++");
	
	System.out.println(l1);
	System.out.println(l2);
	
	for(String value: l1) {
		l2.add(value);
	}
}
}
