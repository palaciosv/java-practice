package day05_math_operators;

public class ArithmericOperators {
	public static void main (String[] args) {
		// = - addidtion operator
		System.out.println(55 + 5);
		int chairs = 140;
		System.out.println(chairs + 2);
		int moreChairs =  chairs + 5;
		System.out.println(moreChairs);
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		//- Subtraction. Minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction =56.44;
		System.out.println(balance-transaction);
		balance = balance-transaction;
		
		System.out.println(balance);
		
		
		//create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//you deleted 2 line
		//decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		
		
		int linesOfCode = 50;
				System.out.println("Lines of code "+ linesOfCode);
				linesOfCode = linesOfCode - 2;
				System.out.println("lines Of Code "+ linesOfCode);
		// multiplication *
				System.out.println(22*2);
				
		//declare variable classes and assign 5
				int classes = 5;
				
				System.out.println(linesOfCode * classes);
				
				int totalLinesOfCode = linesOfCode * classes;
				
				System.out.println(linesOfCode * classes);
			// total lines of code=240
			
				System.out.println("total Lines Of Code = " + totalLinesOfCode);
		//Division Operator/
				System.out.println(10/3);
				System.out.println(55/5);
				System.out.println(10 / 3);
				System.out.println(15/7);
				System.out.println(15.0/7);
				System.out.println(5.0/2);
				
				System.out.println(11/0);
				
	}
}
