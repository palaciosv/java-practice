package replit;
import java.util.*;
public class Replit_67_reverseit {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    int len=word.length();
		    String s="";
		    //WRITE YOUR CODE HERE
		    if (len<5){
		    System.out.println("Too Short!");
		   } 
		    if(len>5) {
		    System.out.println("Too long!");
		    }else {
	  
		    	
		      for(int i=len;i>=0;i--){
		        
		    	  s += word.charAt(i) +"";
		      }}
		      System.out.println(s);
		    
		   
		  }

		}

