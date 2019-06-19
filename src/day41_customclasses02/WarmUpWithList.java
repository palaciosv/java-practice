package day41_customclasses02;

import java.util.ArrayList;
import java.util.List;

public class WarmUpWithList {
public static void main(String[] args) {
	List<Integer>myList = new ArrayList<>();
	myList.add(5);//10
	myList.add(4);//8
	myList.add(10);//20
	System.out.println(doubleTheList(myList));

List<Integer>myList2=new ArrayList<>();
	myList2.add(50);//100
	myList2.add(44);//88
	myList2.add(101);//202
	List<Integer> newList = doubleTheList(myList2);
	System.out.println(newList);
}
	public static List<Integer>doubleTheList(List<Integer>nums){
		for (int i =0;i< nums.size();i++) {
			nums.set(i,nums.get(i)*2);
		}
		return nums;
	


//name: doubleTheList
//return type: List<Integer>
//params: List<Integer> nums
//It will double the values of each element and return it





	
}
}
