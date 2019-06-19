package replit;
import java.util.*;
public class Replit_90_countjava {
	 

	  
		public static void main(String[] args) {
			    Scanner scan= new Scanner(System.in);
			    String word = scan.next();
			    String findWord= "java";
			    int count=0;
			    int java= findWord.length();
			    
			    
			for(int i=0;i<word.length();i++) {
				
				if(findWord.startsWith(Character.toString(word.charAt(i)))){
					if(word.substring(i).length() >= java){
						 if(word.substring(i, i+java).equals(findWord)){
				count++;
			}
					}}
						
					}
			System.out.println(count);
				}
	}

