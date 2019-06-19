package replit;

public class Replit_167_MethodsWithString {
	  public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("wooden-spoon") ) ;
		  }

		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
			 
			  char s=' ';
			 String St= String.valueOf(s);
		      for(int i=0;i<=str.length();i++){
		        
		    	  for(int j=1;j<=str.length();j++){
		        if (j!=i){
		         s= str.charAt(i);
		         s+=s+' ';
		        }}
		      }
			return St;
		  }
		  
}
