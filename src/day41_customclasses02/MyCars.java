package day41_customclasses02;

public class MyCars {
public static void main(String[] args) {
	CustomClassCar car1= new CustomClassCar();
	car1.make="ford";
	car1.model="Fiesta";
	car1.color="Grey";
	car1.currentSpeed=55;
	
	car1.printCarInfo();
	car1.showCurrentSpeed(70);
	car1.showCurrentSpeed(35);
	System.out.println("before mph: "+car1.currentSpeed);
	car1.accelerate(20);
	System.out.println("After: "+car1.currentSpeed);
	
	//creating object ofBMW
	BMW bmw = new BMW();
	
	System.out.println(bmw.make);
	bmw.model = "m3";
	bmw.showPrice();
	
	BMW bmw2 = new BMW();
	bmw2.model= "X3";// X3 i not available
	bmw2.showPrice();
}
}
