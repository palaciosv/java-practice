package day14_string_methods;

public class CharAt {

		public static void main(String[] args) {
			String word = "Computer";
					//print all characters one by one
			System.out.println(word.charAt(0));
			System.out.println(word.charAt(1));
			System.out.println(word.charAt(2));
			System.out.println(word.charAt(3));
			System.out.println(word.charAt(4));
			System.out.println(word.charAt(5));
			System.out.println(word.charAt(6));
			System.out.println(word.charAt(7));
			
			
			//String word2 and check if 1st character is 'j'
			
		String word2 = "Java";
		if (word2.charAt(0) == 'J'){
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		
		}
		
		//String word3 that consists of 5 character
		//Check if firt and last characters are the same.
		//true= first and last match
		//false = first and last are different
		
		
		String word3 = "Civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		
		
		if (first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last are different");
		}
		
		// String word4 = always pring the last character
		//no matter the length
		
		String word4 = "banana";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("last value of " + word4 + " is "+ lastChar );
		
		}
		
		
		}

