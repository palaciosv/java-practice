package day37_vasylreview;

import java.util.Arrays;

public class CharPractice {
public static void main(String[] args) {
	String phoneNumber = "(240) 567 7834";
	//toChaArray - it will convert any string 
	//into array of chars
	char[] chars = phoneNumber.toCharArray();
	System.out.println(Arrays.toString(chars));
	
	int digitCounter = 0;
	//isDigit() method returns true, if given char is digit
	for(char value: chars) {
		if(Character.isDigit(value)) {
			digitCounter++;
		}
	}
	System.out.println("Number ofdigits: "+ digitCounter);
	String name = "Mike";
	
	//Character.isAlphabetic(codePoint)  ==> we use this
	//to verify if valid
	
	boolean isValid = false;
	//we can use for each loop only with arrays or collections
	//since name is a string we need to use a method .toCharArray()
	//that wukk convert string into array of string
	
	for(char var: name.toCharArray()) {
		
	}
	
}
}
