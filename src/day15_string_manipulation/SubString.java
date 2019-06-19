package day15_string_manipulation;

public class SubString {
public static void main (String[] args) {
	String sentence = "Java String Manipulation is fun!";
	System.out.println(sentence.substring(0,4));// java
	
	// print string
	System.out.println(sentence.substring(5,11));// string
	System.out.println(sentence.substring(7,11));
	System.out.println(sentence.substring(20,25));
}
}
