package replit;

import java.util.*;

public class Replit_153UniqueMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] words = new String[size];
		for (int i = 0; i < size; i++) {
			words[i] = scan.next();
		}
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		// WRITE YOUR CODE HERE
		
		for (int i = 0; i <= words.length; i++) {
			int count = 0;
			for (int j = 0; j <= words.length; j++) {
				if (words[i].equals(words[j]) && i != j) {
					count++;
				}else {
					if(count==0) {
						System.out.println(Arrays.toString(words));
					}
				}
			}
		}
	}

}
