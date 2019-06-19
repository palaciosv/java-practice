package day16_string_manipulation;

public class GetNumberFromString {
public static void main(String []args) {
	String sentence = "I wrote [1234] lines of cold today";
	//assign the variable and print the number between [and]
	int start = sentence.indexOf('[')+1;// add +1 because we don want the bracket just the number
	int end = sentence.indexOf(']');// no -1 because it always stops before the character used
	String CodeCount = sentence.substring(start, end);
	System.out.println("Lines of code: " + CodeCount);
	
	System.out.println("Lines of code : "+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
	// aboveis another way of doing the same 
	
// check if codeCount is more than 10
	int count = Integer.parseInt(CodeCount);
			//takes string and convert into integer
	if (count > 20) {
		System.out.println("Wrote more than 20 lines of code today");
	}else {
		System.out.println("Not enough coding for today");
		
	}
}
}
