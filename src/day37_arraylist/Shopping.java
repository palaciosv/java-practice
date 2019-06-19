package day37_arraylist;
import java.util.*;
public class Shopping {
public static void main(String[] args) {
	ArrayList<String> shoppingList= new ArrayList<>();
	shoppingList.add("paper towel");
	shoppingList.add("dish soap");
	shoppingList.add("trash  bag");
	shoppingList.add("clorox");
	shoppingList.add("gloves");
	shoppingList.add("shovel");
	//printnumberof items
	int count = shoppingList.size();
	System.out.println("Total count: "+ count);
	//print all items in a single ln
System.out.println(shoppingList.toString());
//you dont have to put .toString but you can to be sure
//print first and last item
System.out.println(shoppingList.get(0)+"|"+
					shoppingList.get(count-1));
	shoppingList.remove("paper towel");
	shoppingList.remove("shovel");
	// will remove paper towel
	System.out.println(shoppingList);
	System.out.println(shoppingList.get(0));
	shoppingList.remove(0);
	System.out.println(shoppingList);
	//index at 0 (dishsoap was removed
	
	// for each loop can be used only for reading
	//we cannot modify list inside loop
	for(String item : shoppingList) {
		System.out.println(item);
		//prints one by one
	}
	//remove all items at once
	shoppingList.clear();
	System.out.println(shoppingList.toString());
	//everything removed
	

}
	
}
