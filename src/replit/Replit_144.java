package replit;
import java.util.Scanner;
public class Replit_144 {


	  
	  public static void sign(int n)
	  {
	    //your code here
		  if(n==0) {
			  n=0;
			  System.out.println(n);
		  }
		  if(n>0) {
			  n=1;
			  System.out.println(n);
		  }
		  if(n<0) {
			  n=-1;
			 System.out.println(n);
		  }
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }
	}

