package day38_arraylist03;

import java.time.Month;
import java.util.ArrayList;

public class ContainsMethod {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>();
	
	list1.add("Jan");
	list1.add("Feb");
	list1.add("march");
	list1.add("april");
	list1.add("may");
	System.out.println(list1.toString());
	ArrayList<String> months = new ArrayList<>(list1);
	//copy all values from list1
	System.out.println(months);
	months.add("june");
	months.add("july");
	months.add("Aug");
System.out.println(months);
System.out.println(months.contains("Jan"));
System.out.println(months.contains("Dec"));
//HOW WOULD YOU CHECK IF FEB IS IN SECONDPOSITION
System.out.println(months.indexOf("Feb")==1);
System.out.println(months.get(1).contentEquals("Feb"));

ArrayList<String>month2 =new ArrayList<>(list1);
System.out.println("Month: "+months.toString());
System.out.println("Month2: "+month2.toString());

//check if months has all the values of month2
if(months.containsAll(month2)) {
	System.out.println("Months has all of month2");
}else{
	System.out.println("Some values are missing");
}
//addone more Jan to month2
}
}