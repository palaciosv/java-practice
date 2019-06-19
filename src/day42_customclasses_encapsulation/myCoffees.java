package day42_customclasses_encapsulation;

public class myCoffees {
public static void main(String[] args) {
	
	Coffee coffee1 = new Coffee();
	coffee1.name= "iced caramel macchiato";
	coffee1.size = "GRANDE ";
	coffee1.price=4.75;
	coffee1.calories=250;
	
	coffee1.getCoffee();
	
	Coffee coffee2 = new Coffee();
	coffee2.setName("Java Chip");
	coffee2.size="Venti";
	coffee2.price=5.95;
	coffee2.calories=600;
	
	coffee2.getCoffee();
	
	Coffee coffee3 = new Coffee();
	coffee3.setName("Iced coffee");
	coffee3.setSize("tall");
	coffee3.setPrice(2.45);
	coffee3.setCalories(60);
	
	System.out.println("Coffee3 name: "+ coffee3.name);
	coffee3.getCoffee();
	
	Coffee coffee4 = new Coffee();
	coffee4.setCoffeeInfo("Flat White", "tall", 3.95, 170);
	coffee4.getCoffee();
}
}
