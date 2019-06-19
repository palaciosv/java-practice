package day24_loopsandarrays;

public class ABC {
	  public static void main(String[] args) {
		    System.out.println("Hello world!");
		  }
		  
		  /**
			 * @param target - string that you need to check.
			 * @param sentence - string where you need to lookup for target.
			 * @return 
			 */
			public static boolean appearsTwice(String target, String sentence) {
		        int count=0;
		        String[] str= sentence.split(" ");
		        
		        for (int i = 0; i < str.length; i++) {
		            if(str[i].equalsIgnoreCase(target)) {
		                count++;
		                if(count==2) {
		                    return true;
		                }
		                }
		            }
		        return false;
		        }}
