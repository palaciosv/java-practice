package replit;
import java.util.*;
public class Replit_65 {


	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		 int  words=word.length();
		    
		    if(words%2==1&&words>=5) {
		    	System.out.print(word.charAt((words/2)-1));
		    	System.out.print(word.charAt(words/2));
		    	System.out.println(word.charAt((words/2)+1));
		    }else {
		    	System.out.println("invalid");
		    }
		  }
		}