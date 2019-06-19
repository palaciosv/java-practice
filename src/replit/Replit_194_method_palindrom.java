package replit;

public class Replit_194_method_palindrom {
public static void main(String[] args) {
	

	
	isPalindrome("BOOB");
}
	
public static boolean isPalindrome(String check) {
    
	boolean isReversed=false;
    String reversed="";
 if(check.contains(" ")) {
	 check.replace(" ",	"");
 }
    
  for(int i =check.length()-1;i>=0;i--) {
	  
    reversed=reversed+check.charAt(i);
  }
    if(reversed.equalsIgnoreCase(check)) {
      isReversed=true;
    
    }
  return (isReversed);
  }
}