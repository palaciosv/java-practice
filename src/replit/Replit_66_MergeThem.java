package replit;
import java.util.*;
public class Replit_66_MergeThem {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		    
		       String s = "";
		        int i = 0;
		        if(word1.length()==3 && word2.length()==3){
		        while (i < word1.length() && i < word2.length()){
		            s += word1.charAt(i) +""+ word2.charAt(i); 
		            i++;
		        }
		        System.out.print(s);
		        
	  } else{
		         	System.out.println("cannot merge");
		        }}}