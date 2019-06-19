package replit;
import java.util.*;
public class Replit_105_Arrays_firstlastchar {
	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		    String[] words1=new String[words.length];

		    //TODO: Write your code below
		    
		    for(int i=0;i<words.length;i++) {
		    	words1[i]=words[i].charAt(0)+""+words[i].charAt(words.length)+"";
		    }
		    System.out.println(Arrays.toString(words1));
		  }
		}
