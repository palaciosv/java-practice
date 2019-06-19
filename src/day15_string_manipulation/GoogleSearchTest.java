package day15_string_manipulation;

public class GoogleSearchTest {

		public static void main (String[] args) {
			String item ="java";
			String pageTitle= item + " -google search";
			// testif pageTitle stats with python
			if (pageTitle.startsWith(item)) {
				System.out.println("Page Title Check Passed");
			}else{
				System.out.println("Fail:page title check");
			}
			if (pageTitle.endsWith("google search")) {
				System.out.println("Pass: google search is in title");
			}else { 
				System.out.println("Fail:google search is not in title");
			}
			
			
			
			
			
			
			
			
			
}}
