package replit;
import java.util.*;
public class Replit_87_hasaJava {
	  public static void main(String[] args) {
		    boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
	    
	    int len = word.length()-2;
		
		for(int i = 0; i < len; i++)
		{
			
		if(i==0||i==1) {
			if(word.charAt(i) == 'j')
			{
				if(word.charAt(i+1) == 'a' && word.charAt(i+2) == 'v' && word.charAt(i+3)=='a')
					exists=true;	
			}
}}
		System.out.println(exists);
}}