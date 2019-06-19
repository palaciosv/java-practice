package day38_arraylist03;
import java.util.*;
public class MethodsSummary {
	public static void main(String[] args) {
		
	
List<String> list=new ArrayList<>();
list.add("Red");
list.add("blue");
list.add("white");
list.add("grey");
list.add("black");

//add method withindex
list.add(0,"yellow");
//toString method to print all values in same line
System.out.println(list.toString());
//size method- returnnumberofvalues
System.out.println("Number of elements: "+ list.size());
//get method- return value from method
System.out.println(list.get(3));
System.out.println(list.get(0));
//remove using index
list.remove(0);
//wil remove yellow

	}
}
