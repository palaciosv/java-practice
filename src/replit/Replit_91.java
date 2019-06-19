package replit;
import java.util.Scanner;
public class Replit_91 {
	

	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter words");
	    //
	    String str = scan.nextLine();
	   //
	
	    int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.contains("hi")) {
				
					count++;
				}else {
					continue;
				
			}
		}
	 
	   System.out.println(count);
   }
	  }
	

