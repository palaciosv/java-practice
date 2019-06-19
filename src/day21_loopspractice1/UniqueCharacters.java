package day21_loopspractice1;

import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String[] args) {
	
String word= "jaavva";
String unique="";

char ch =word.charAt(0);
	
	System.out.println(unique.contains(""+ch));
	
	if(!unique.contains(""+ch)) {
	unique+= ch;// unique = unique+ch
		
	
	
	System.out.println("Unique:" +unique);
	
	String word2= "bananas";
	String unique2="";
	
	int i= 0;
	char ch2 = word2.charAt(i);
	System.out.println("CH2: "+ch2);//b
	
	i=1;
	
	ch2=word2.charAt(i);
	System.out.println("CH2: " + ch2);
	i++;//a
	System.out.println("CH2: " + ch2);
	i++;
	System.out.println("CH2: " + ch2);//n
	}
}}
