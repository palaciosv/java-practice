package replit;

public class Replit_168_String3 {
	  public static void main(String[] args) {
		    System.out.println(coverString("java methods", "me")); //java [me]thods
	  
	  }
		  public static String coverString(String main, String coverME) {
			  String[] arr=main.split(" ");
				char ch=coverME.charAt(0);
		    for (int i=0;i<main.length();i++) {
		    	if (main.charAt(i)==coverME.charAt(0)) {
		    	//for(int j =i+1;j<main.length();j++) {
		    
				if(ch==main.charAt(i)) {
		    			System.out.println("["+coverME+"]");
		    		}
		    		
		    
		 //   }
		    	}}
			return coverME;}}
		  
		  
		