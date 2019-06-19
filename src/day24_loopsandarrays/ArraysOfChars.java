package day24_loopsandarrays;

public class ArraysOfChars {
public static void main(String[]args) {
	
	char[] values = {'a', 'b','c'};
	for(char value:values) {
		System.out.println(value);
	}
	String str = "wooden spoon ";
	//this, method toCharArray() converts string into 
	//array of characters
	char[] chars = str.toCharArray();
	for(char c: chars) {
		System.out.print(c);
		str = "";
	}
	for(int i =chars.length-1;i>=0;i--) {
		str+=chars[i];
	}
	System.out.print(str);
	//print character with help of array of characters, one by one
	//if characters is equal to'0', replace with '*';
	
	for(char c: chars) {
		if(c =='0') {
			System.out.println("*");
		}else {
			System.out.println(c);
		}
	}
	System.out.println();
	char[] newChars = new char[3];
	System.out.println("Value of char:" + newChars[0]);

	}
}

