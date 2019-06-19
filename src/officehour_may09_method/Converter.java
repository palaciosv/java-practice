package officehour_may09_method;

import java.text.DecimalFormat;

public class Converter {
	public static void main(String[]args) {
		System.out.println(milesToKms(10));
		System.out.println(milesToKms(70));
		double km = milesToKms(45);
		System.out.println(km);
		System.out.println(multiply(4,8));
		System.out.println(milesToKms(10));
	double litersValue= gallonsToLiters(15);
	//formats to 2 decimalpoints only
	DecimalFormat dm = new DecimalFormat("#.##");
	
	System.out.println(dm.format(litersValue));
	//get rid of decimal point value
	System.out.println(Math.floor(litersValue));
	}
public static double milesToKms(double miles) {
	//double kmValue= miles *1.609;
	double kmValue=multiply(miles,1.609);
	//above is same thing except calling another method
	return kmValue;
}
public static double multiply(double num1, double num2) {
	return num1*num2;
}
public static double gallonsToLiters(double gallons) {
	//multiply volume by 3.785
	
	double litersValue= multiply(gallons , 3.785);
	return litersValue;
	
	
}
}
