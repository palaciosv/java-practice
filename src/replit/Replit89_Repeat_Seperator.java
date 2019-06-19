package replit;
import java.util.*;
public class Replit89_Repeat_Seperator {
	 

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		   String result="";
		    
		 for(int i=0;i<count;i++) {
			 
			 result=result+word+separator;
			  	}
		 		
		 
		 
				  System.out.println(result.substring(0,result.lastIndexOf(separator))); 
			  
		 }
		
		
	}	  

