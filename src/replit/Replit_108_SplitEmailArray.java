package replit;
import java.util.*;
public class Replit_108_SplitEmailArray {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		   
		    //Write your code below
		    
		    int count=0;
	
			if (email.contains("@")) {
				String[] emailId = email.split("@");
				for(int i=0;i<emailId.length;i++) {
					if(emailId[i].contains("@")) {
						count++;
						
					}if(count!=1) {
						System.out.println("invalid email");
					}
				}
				
				
				
			//	String[] emailId = email.split("@");
				if(emailId[1].contains("@")) {
					  System.out.println("invalid email");
				  }else {
					  System.out.println("Email id: "+emailId[0]);
					  System.out.println("Email domain: "+emailId[1]);
				  }
			
			
			}else {
				System.out.println("invalid email");
			}
			
	  }

}