package day31_methods04;

public class MethodsWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		
		int i = giveMe10$();
		System.out.println("i: "+ i);
		
		System.out.println("Name: "+ giveMeYourName());
	}
	// this method, return int value
public static int giveMe10$() {
	System.out.println("Returning 10 from method");
	return 10;
	
}

public static String giveMeYourName() {
	String name= ("Vanessa");
	return name;// retun"Vanessa"; <== Same thing as abov.,e
	
}
}
