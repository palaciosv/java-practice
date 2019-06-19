package day38_arraylist03;
import java.util.*;
public class ContainsAll {
public static void main(String[] args) {
	List<Integer> nums1= new ArrayList<>();
	
	nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);
	List<Integer>nums2 = new ArrayList<>();
	nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);

	//test if nums1 has all nums2 value
	
	if (nums1.containsAll(nums2)) {
		System.out.println("Num1 contains all nums2");
	}else {
		System.out.println("Nums does not contain all nums2");
	}
	System.out.println(nums2.containsAll(nums1));
	boolean b = nums1.containsAll(nums2)&&nums2.containsAll(nums1);
	
	List<String> planA= new ArrayList<>();
	planA.add("java");
	planA.add("replit");
	planA.add("Ping pong");
	planA.add("food");
	planA.add("run");
	planA.add("sleep");
	
	List<String> planB = new ArrayList<>();
	planB.add("Food");
	planB.add("run");
	planB.add("sleep");
	planB.add("java");
	planB.add("ping pong");
	planB.add("java");
	
	if(planB.containsAll(planA) && planA.containsAll(planB)) {
		System.out.println("Match");
	}else {
		System.out.println("No match");
	}

}}
