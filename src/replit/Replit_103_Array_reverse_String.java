package replit;
import java.util.*;
public class Replit_103_Array_reverse_String {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String reversed = "";
    //TODO: start your code here
    
     String [] words=sentence.split(" ") ;
   
   for(int i =words.length;i>=0;i--) {
	   reversed=reversed+" "+ words[i];
   }
   
   
    //End your code here. do not modify below statement
    System.out.println(reversed);
}
}
//String[] words=s1.split("\\s")