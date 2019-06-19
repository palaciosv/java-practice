package day42_customclasses_encapsulation;

public class Coffee {
	String name = null;
	String size;
	double price = 0;
	int calories = 0;

public void getCoffee() {

String info="Coffee name: "+name.toUpperCase()+", size: "+size.toUpperCase()+ ", price: $ "+price+", calories: "+calories;
System.out.println(info);
}
public void setName(String newName) {
	name= newName;
}
public void setSize(String newSize) {
	if(newSize.equalsIgnoreCase("TaLL")|| newSize.equalsIgnoreCase("grande")||
			newSize.equalsIgnoreCase("venti")){
	size=newSize;}else { 
		System.out.println("Size unknown");
		size= " unknown";
	}
}
public void setPrice(double newPrice) {
	price=newPrice;
}
public void setCalories(int newCalories) {
	calories=newCalories;
}
public void setCoffeeInfo(String newName,String newSize, double newPrice, int newCalories) {
name=newName;
size=newSize;
price=newPrice;
calories=newCalories;
	
}
}