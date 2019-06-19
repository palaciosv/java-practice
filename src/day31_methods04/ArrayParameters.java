package day31_methods04;

import java.util.Arrays;

public class ArrayParameters {
public static void main(String[] args) {
	int[] myArray = {44,22,66,11};
	printArray(myArray);
	printArray(new int[] { 33, 45, 5, 7});
	
	int [] myNums= new int[]{3,4,5,6,7,8,87,5,46,43,56,67};
	printArray(myNums);// doing the same this as above the line above
	
	int[] one= {10,2,3};
	int[] two= {3,1};
	print2Arrays(one,two);
	
	print2ArraysV2(one,two);
	}
	
//***
	//method: Print array
	//return type: void
	//param: int[] nums
	//print values of the nums rray

	
	public static void printArray(int[] nums) {
		for(int n: nums) {
			System.out.print(n + " ");
		
		}
		System.out.println();
		
	
	}
	
//  Method name: print2Arrays
//	Return:void
//	params: 2 int[] arrays
//	it prints the larger array folowed by the smaller arry
	
	public static void print2Arrays(int [] arrNums1,int [] arrNums2) {
	if(arrNums1.length>arrNums2.length) {
		System.out.println(Arrays.toString(arrNums1));
		System.out.println(Arrays.toString(arrNums2));
	}else {
		System.out.println(Arrays.toString(arrNums2));
		System.out.println(Arrays.toString(arrNums1));
	}}
	
	
	
	//version 2 we will call printArray Method
	public static void print2ArraysV2(int [] arrNums1,int [] arrNums2) {
	if(arrNums1.length>arrNums2.length) {
		printArray(arrNums1);
		printArray(arrNums2);
	}else {
		printArray(arrNums2);
		printArray(arrNums1);
	}
	
}
}
