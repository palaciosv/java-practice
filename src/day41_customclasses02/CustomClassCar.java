package day41_customclasses02;

public class CustomClassCar {
	String make = "";
	String model = "";
	int currentSpeed = 0;
	String color="";

	public void printCarInfo() {
		System.out.println("Printing car info...");
		String info = "make "+make+", model "+model+", color "+ color+", current Speed "+ currentSpeed;
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		
		if (currentSpeed<=speedLimit) {
			System.out.println(make+ " is driving at"+ currentSpeed+", following speed limit-55");
		}else {
			System.out.println(make+"is driving at "+ currentSpeed+" mph, over the spedlimit-55");
		}
		
	}
	public void drive() {
	System.out.println(make+ " "+ model+ " is diving...");
}
	public void accelerate(int mph) {
		currentSpeed+=mph;
		
		//increase current speed by mph
	}
	
	public static void main(String[] args) {
		
	}
	
}
