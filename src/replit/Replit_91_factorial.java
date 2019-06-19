package replit;
import java.util.*;
public class Replit_91_factorial {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    long total=1;
		    
		    for(int i = 1; i <= n; i++) {
		       total = total * i;}
		    System.out.println(total);
		  }		
}

