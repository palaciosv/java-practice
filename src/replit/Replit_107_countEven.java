package replit;
import java.util.*;
public class Replit_107_countEven {
	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    int count=0;
		    //TODO: Write your code below
		    for(int i=0;i<nums.length;i++){
		      if(nums[i]%2==0){
		        count++;
		      }
		    }
		    System.out.println(count);
		  }
		}

