package day24_loopsandarrays;

public class CheckFirstAndLastValue {
	public static void main(String[]args) {
		//write a program that will print true 
		//if first and last value in the array is true
		
		int[] numbers = {12,41,213,21,42,12};
		//.length is not a method its and instance variable(property)
		boolean equals = numbers [0] == numbers[numbers.length-1];
		System.out.println(equals);
	
		
	}
	
	}
