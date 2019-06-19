package replit;
import java.util.*;
public class Replit_86 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		    
		    int len = word.length()-2;
			
			for(int i = 0; i < len; i++)
			{
				if(word.charAt(i) == 'c')
				{
					if(word.charAt(i+1) == 'a' && word.charAt(i+2) == 't')
						countOfCats++;
				}
				else if(word.charAt(i) == 'd')
				{
					if(word.charAt(i+1) == 'o' && word.charAt(i+2) == 'g')
						countOfDogs++;
				}
			}
		    
		    if(countOfDogs==countOfCats) {
		    	System.out.println("true");
		    }else{
		    	System.out.println("false");
		    	
		    }
		  }
}
