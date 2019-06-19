package replit;
import java.util.*;
public class Replit_73 {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    
		    
		    int underscore=email.indexOf("_");
		    int dot=email.indexOf(".");
		    
		    int sign =email.indexOf("@");
		    String name=email.substring(0,underscore);
		    String lastname=email.substring(underscore+1,sign);
		    System.out.println(lastname + "_" +name+email.substring(sign));
		    
		  
		      System.out.println("First name: "+name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
		      System.out.println("Last name: "+lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase());
		      System.out.println("Domain: "+email.substring(sign+1,dot));
		      System.out.println("Top-Level Domain: "+email.substring(dot+1,email.length()));
		  }
		}

