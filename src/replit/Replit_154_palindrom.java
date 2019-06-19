package replit;
import java.util.*;
public class Replit_154_palindrom {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		  }
		  
		  public static void isPalindrome(int num){
		    //WRITE YOUR CODE HERE
		    String word= Integer.toString(num);
			int idx=word.length();
			String reversed="";
					while(idx >= 0) {
						reversed = reversed + word.charAt(idx);
						idx--;
					}
					
					System.out.println(reversed);
					//compare if word and reversed are equal
					if(reversed.equalsIgnoreCase(word)) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}

				}
		    
		  }
