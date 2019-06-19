package day15_string_manipulation;

public class IndexOf {

		public static void main(String[] args) {
						// 012345
			String word1= "github";
		System.out.println(word1.indexOf('g'));//0
			
		System.out.println(word1.indexOf("th"));//3
		
		System.out.println(word1.indexOf("hub"));//3
		System.out.println(word1.indexOf("java"));//-1
		
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Pos of . :" + i);
		System.out.println(url.charAt(i+1));
		
		
		String title = "Java - Google Search";
				//find position of '-' and check if space is on right and left side
				
		int dash = title.indexOf('-');//5
		System.out.println(title.charAt(dash-1));//""
		System.out.println(title.charAt(dash+2));
				        //01234567
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Positions of states: " + states);
		
		
		String word2 = "java, c++, python, tomcat, eclipse";
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		if (word2.indexOf("c++")>-1);{
				
		System.out.println("c++ is there");
		
			
}}}
