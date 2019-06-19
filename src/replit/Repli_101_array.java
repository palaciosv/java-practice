package replit;
import java.util.*;
public class Repli_101_array {
	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		    //TODO: Write your code below
		    for(String str: words){
		     String first= str.substring(0,1);
		    
		     String laast= str.substring(str.length()-1);
		     
		     System.out.println(first+laast);
		    }}
}
