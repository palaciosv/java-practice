package day41_customclasses02;

public class Microwave {
 String brand = "";
 boolean isOn;


public void turnOn(){
	System.out.println("Turning on the microwave");
	if (isOn==true) {
	System.out.println(brand+" microwave Is already on");
}else {
	System.out.println("turning on "+brand+" microwave");
	isOn=true;
}}


public void turnOff() {
	if(isOn==false) {
		System.out.println(brand+ " microwave is already off");
		
	}else {
		System.out.println("Turning off "+ brand+ "microwave");
		isOn=false;
	}
}

public void heat(String food) {
	if(isOn) {
		System.out.println("Heating "+ food);
	}else {
		System.out.println("microwave is off cannot heat "+ food);
	}
}

}