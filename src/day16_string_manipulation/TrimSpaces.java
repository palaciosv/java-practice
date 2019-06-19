package day16_string_manipulation;

public class TrimSpaces {
public static void main (String[] args) {
	String word1 = "  String Methods  ";
	System.out.println(word1);// still has spaces
	System.out.println(word1.trim());// took out spaces
	System.out.println(word1);// still has spaces because you didnt assign to string
	
	String word2 = "  ThreeSpaces here  ";
	System.out.println(word2.trim());
	word2 = (word2.trim());
	System.out.println(word2);// updated string with spaces removed
	
	
	
}
}
