package replit;
import java.util.*;
public class Replit_155_fibonacci {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		 
		  public static void fib(int num){
			  
			  int previousNumber=0;
			  int nextNumber=1;
			  int sum=0;
			  
		    //WRITE YOUR CODE HERE
			 //0,1,1,2,3,5,8,13,21,34,55,89
			  for(int i=3;i<=num;i++) {
				  sum=previousNumber+nextNumber;
				previousNumber=nextNumber;
				nextNumber=sum;
		  
		 }
				System.out.println(sum);	
		  }}
		

