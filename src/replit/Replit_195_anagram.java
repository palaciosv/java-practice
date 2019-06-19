package replit;
import java.util.*;
public class Replit_195_anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	
		isAnagram(word1,word2);
	}
	
	
public static boolean isAnagram(String word1, String word2) {
		if(word1.length()==word2.length()) {
		if (word1.contains(word2)) {
			return true;}
		  }else {
		return false;
		

}
		return;}}
