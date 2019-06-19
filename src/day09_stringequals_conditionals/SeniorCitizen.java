
	package day09_stringequals_conditionals;
	import java.util.Scanner;
		public class SeniorCitizen {
		public static void main(String []args) {

		int seniorCitizens, nonSeniorCitizens;
		int age;

		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens=scan.nextInt();
		nonSeniorCitizens = scan.nextInt();
		
			System.out.println("What is new citizn's age?");
			age=scan.nextInt();
			
			if(age>=65) {
				System.out.println("Senior Citizen");
				seniorCitizens++;
			}else{
				System.out.println ("non Senior Citizen");
				nonSeniorCitizns++;
			 
			 }
		System.out.println("New seniorCitizens count ValueOfVariable");
		System.out.println("New nonSeniorCitizens count ValueOfVariable");
		
			
			
			
			}
		
}
