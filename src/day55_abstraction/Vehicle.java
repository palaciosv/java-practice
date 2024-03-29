package day55_abstraction;

public abstract class Vehicle {
	private int wheels;
	private double price;
	private String type;
	private String powerSource;
	
	public Vehicle(int wheels, double price, String type, String powerSource) {
		this.setWheels(wheels);
		this.setPrice(price);
		this.setType(type);
		this.setPowerSource(powerSource);
	}
	



public int getWheels() {
	return wheels;
}

public void setWheels(int wheels) {
	this.wheels = wheels;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPowerSource() {
	return powerSource;
}

public void setPowerSource(String powerSource) {
	this.powerSource = powerSource;
}
public abstract void move();
	
}



