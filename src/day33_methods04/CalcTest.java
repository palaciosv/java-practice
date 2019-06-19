package day33_methods04;

import day31_methods03.Calculator;

public class CalcTest {
public static void main(String[]args) {
	System.out.println(CalculatorFinal.add(3, 1));
	System.out.println(CalculatorFinal.multiply(5, 6));
	System.out.println(CalculatorFinal.minus(4, 12));
	System.out.println(CalculatorFinal.divide(100, 2));
	
	int addResult = CalculatorFinal.add(21, 41);
	
	double mResult=CalculatorFinal.multiply(50, 40);
	double minResult=CalculatorFinal.minus(3000, 200);
	double dResult= CalculatorFinal.divide(455, 5);
	
	
	System.out.println("Add Result: "+addResult);
	System.out.println("MultiplyResults: "+mResult);
	System.out.println("Minus Result: "+minResult);
	System.out.println("Division Result: "+dResult);
	
	double a =10.0, b =5.0;
	double myResult = CalculatorFinal.minus(a,b);
	System.out.println("My Result: "+ myResult);
	
	double[] dNums = {2.0,4.0};
	double result2=CalculatorFinal.multiply(dNums[0], dNums[1]);
	if(CalculatorFinal.add(10, 16)== 26) {
		System.out.println("Add unit test passed");
	}else {
		System.out.println("Add unit test failed");
	}
	String str = "java";
	if(str.length()==4) {
		System.out.println("It is 4 characters");
	}else {
		System.out.println("It is not 4 characters");
	}
}
}
