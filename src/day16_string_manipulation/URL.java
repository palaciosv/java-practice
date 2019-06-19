package day16_string_manipulation;
import java.util.Scanner;
public class URL {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		 


	
	 System.out.println("Enter url: ");
	String url = scan.next();
	 
	 
if (url.startsWith("www.")){
	System.out.println("www. is present");
	  }else {
		  System.out.println("invalid url format");
		  return;
	}
// check . is there before extension
// find out the length of the url
//do minus4 and using charAt get the character
//compare if it is .

     int dotIndex = url.length() - 4;
//url.lastIndexOf(".");
     if(url.charAt(dotIndex) == '.'){
    	 System.out.println(". is there before extension");
     }else {
    	 System.out.println(". is misplaced");
    		 }
/*
 if (url.charAt(url.length()-4)=='.'
  */
//get domain and extension
     
  String domain = url.substring(4, dotIndex);
  System.out.println("Domain: "+domain);
  String extension= url.substring(dotIndex+1, url.length());
System.out.println("Extension: "+extension);

}
}