package replit;
import java.util.*;
public class Repli_93_PrefixAgain {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int n = scan.nextInt();
		    char s=str.charAt(0);
		    int countOccurences=0;
		    for(int i =0;i<str.length();i++) {
		    	if(n==i) {
		    		countOccurences=countOccurences+1;
		    		
		    		
		    	}}
		    if (countOccurences==n) {
		    	System.out.println("True");
		    }else {
		    	System.out.println("False");
		    }
		    	
		    }
		  
	  }

