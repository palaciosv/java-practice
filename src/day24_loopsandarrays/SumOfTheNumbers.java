package day24_loopsandarrays;
import java.util.*;
public class SumOfTheNumbers {
public static void main (String[]args) {
	//lets creat an array of integers with length 3
	int[] numbers = new int[3];
	//first vale in array
	numbers[0] = 5;
	//second value in array
	numbers [1] = 10;
	//third value in array
	numbers[2] = 20;
	
	System.out.println(numbers);
	//[I@1e643faf some kind of hashcode

	//toString()from arrays class can help as to print an arrays as string
	System.out.println(Arrays.toString(numbers));
	
	int sum= 0;
	//please use for loop in order to loop through the array
	//and calculate the sum of all elements
	
	for (int i = 0;i<numbers.length; i++) {
		sum = sum +numbers[i];
	}
	System.out.println("sum: "+ sum);
		
		//find largest value in the array
	int max = Integer.MIN_VALUE;
	//System.out.println(max); 
	//-2147483648
	
	for(int i = 0; i<numbers.length;i++) {
		if (numbers[i] > max) {
			max = numbers [i];
		}	
		}
		System.out.println("Max value: " + max);
		
	//find min value in arrary
		int min = Integer.MAX_VALUE;
		for (int k = 0; k<numbers.length;k++) {
			if(numbers[k] < min) {
				min = numbers[k];
				
			}
		}
		System.out.println("min value: " + min);
		
	}
	}
		

	

