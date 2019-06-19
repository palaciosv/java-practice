package replit;
import java.util.*;
public class Replit_114_Arrays_findDuplcate {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    //Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
		    //TODO: write your code below
		    //TODO: write your code below
		     int unique=0;
				    int count=0;
				   for(int i =0;i<=nums.length-1;i++) {
					   for(int j=0;j<=nums.length-1;j++) {
						   if (nums[i]==nums[j]) {
							   count++;
						   }
					   }
					   if(count==1) {
						   unique=nums[i];
						   break;
					   }
				   count=0;
				   }
				    System.out.println(unique);
				  }
				}

