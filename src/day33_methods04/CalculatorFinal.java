package day33_methods04;

public class CalculatorFinal {
	public static void main(String[]args) {
		addVoid(2,5);
		//below line will not work because addVoid does not 
		//return a value. it just perform action
		
		
		//add(4,8); does not return by itself
		int result=add(4,8);// we have to assign it into another variable and then print it 
		System.out.println("Result: "+result);
		
		result=add(10,30);
		System.out.println("Result: "+result);
		
	}
	//1. method void 
	public static void addVoid(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Sum: "+ sum);
	}
	//2. method return int
	public static int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
		
	}
	// Method: multiply with return value
		// Method: minus with return value
		// Methods: divide with return value
		public static double multiply(double num1, double num2) {
			double result = num1* num2;
			return result;
		}
		public static double minus(double num1, double num2) {
			double result= num1-num2;
			return result;
			//return num1-num2;
		}
	public static double divide(double num1,double num2) {
		if(num2==0) {
			System.out.println("Error: Cannot divide by 0");
			return 0;
		
		}else{
		
		double result = num1/num2;
		return result;
	}
	
	}
}