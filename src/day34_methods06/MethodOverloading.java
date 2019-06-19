package day34_methods06;

public class MethodOverloading {
public static void main(String[] args) {
	add(10,20);
	add(20.2,18.4);
	
}
public static void add(int num1,int num2) {
	int result = num1 +num2;
	System.out.println("Result: "+ result);
	
}
	public static void add(double d1,double d2) {
		double result = d1+d2;
		System.out.println("Result: "+result);
	}
	
	
	
	
}
