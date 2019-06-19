package day26_arrays04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String words= "java,kava,html,selenium";
		String[] wordsArray=words.split(",");
		System.out.println("Count: "+wordsArray.length);
		//print first one
		System.out.println(wordsArray[0]);
		//print all in one line
		System.out.println(Arrays.deepToString(wordsArray));
		///print one by one
		for(String word:wordsArray){
			System.out.println(word);
		}
		String diceResult ="1 - 20 of 1,461 positions";
		String[]resultArray=diceResult.split(" ");
		System.out.println("count spaces: "+resultArray[4]);
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0]);
		System.out.println(diceArray2[1]);
		
		System.out.println(diceArray2[0].trim());//trim space in the beginning
		System.out.println(diceArray2[1].trim());
		
		String sentence ="I felt happy because I saw the others were happy and"
				+ " because I knew I should feel happy, but I wasn�t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] iSplit =  sentence.split("I");
		
		for(String w : allWords) {
			System.out.println(w);// prints each word in seperate ling
		}
		System.out.println("After happy split");
		for(String w : happySplit) {
			System.out.println(w);
		}
		for(String w : iSplit) {
			System.out.println(w);
}
	String word = "java";
	char[] charsArray = word.toCharArray();
	for (char ch : charsArray) {
		System.out.println(ch);
	}
	}}
