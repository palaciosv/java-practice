package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main (String[] args) {
	
		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0;
	
	System.out.println("Rating:" + rating);
	
		int PMHour = 6;
		
		//Rush hour during evening: 4 -7
		boolean rushHour = (PMHour >= 4 && PMHour <=7)? true : false ;
		//	System.out.println(PMHour + " is rush hour? " + rushHour);	
		// IfrushHour is true answer is yes, if rushhour is false then answer is no
	
		
		String result = rushHour == true ? "yes": "no";
			
			System.out.println(PMHour + " is rush hour? " + result);	
	
	//====================
			int AMHour =8;//6-9
			String amRushHour = AMHour >= 6 && AMHour <= 9 ?"yes" : "no";
			
			System.out.println(AMHour + "is rush hour? - "+ amRushHour);
			
	
	
	
	}
}