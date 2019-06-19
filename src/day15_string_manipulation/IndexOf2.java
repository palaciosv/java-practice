package day15_string_manipulation;

public class IndexOf2 {
	public static void main (String[] args) {
		//index of 2 inputs
		
		
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash=list.indexOf("-");
		System.out.println("First dash: " + firstDash);
		
		int secondDash=list.indexOf("-", 5);// start searching from 5th index
		System.out.println("Second dash: " + secondDash);
		// find the third one buy using second dash variable
		
		
		int thirdDash= list.indexOf("-", secondDash+1);
		System.out.println("Third dash: "+thirdDash);
		// find the last dash
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);
		
		
		
	}
}
