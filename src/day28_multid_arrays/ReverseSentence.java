package day28_multid_arrays;
import java.util.*;
public class ReverseSentence {
public static void main(String[] args) {

	
	String sentence = "you are very interesting person";
	
	String[] arrSentence= sentence.split(" "); 
	// takes out the space
	
	System.out.println("numberof words: " + arrSentence.length);
	//  .length will count the number of words
	
	
	System.out.println(Arrays.toString(arrSentence));
	// print out each words 
	
	String reversed = "";
	
	for (int i = arrSentence.length-1; i >=0; i--) {
		
		//-1 afterlengh because it starts at 5 but i t should start at 4 since there in a 0 digit
		//i-- will reverse words
		reversed+= arrSentence[i]+" ";
	}
		reversed=reversed.trim();
		//gets rid of extra space at the end
		System.out.println(reversed);
		
	
	
	
}
}
