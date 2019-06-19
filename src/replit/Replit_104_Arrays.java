package replit;
import java.util.*;
public class Replit_104_Arrays {
	  public static void main(String[] args) {
		  
		  
		  
		  //Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
		  //If no consecutive 5s or no 5s are detected in your code then print false.
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    boolean isTrue=false;
		    for(int i=0;i<nums.length-1;i++){
			      if(nums[i]==(5)&& nums[i+1]==5){
		
			       isTrue=true;
			       break;
			     }
			   }
			    				  			     
	 	      System.out.println(isTrue);
			    		    
			    
	  }}