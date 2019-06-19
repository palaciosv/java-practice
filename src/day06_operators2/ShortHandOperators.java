package day06_operators2;

public class ShortHandOperators {
	public static void main(String[]args) {

	int students=45;
	System.out.println("students:" + students);
	
	students = students -2;
	System.out.println("Students:"+(5));
	
	int cars = 12;
	System.out.println("Cars:"+ cars);
	
	cars *=2;// cars = cars*2;
	cars +=cars;
	System.out.println(cars);
	cars += cars;
	
	System.out.println("Cars: "+ cars);
	
	int shoes = 20;
	shoes /=4 ; // shoes = shoes /4
	
	System.out.println("shoes  + shoes");
	
	double price =45.50;
	int amount = 5;
	price += amount;
	
	
	int minutes = 66;
	minutes %= 60;
	System.out.println("Remaining :" + minutes);
	
	int pennies = 550;
	pennies %= 100;
	System.out.println("pennies left: " + pennies);
	
	
	int apples = 10;
	apples = -3;
	System.out.println(apples);
	
	int count = 1;
	count = count +1; //2
	count +=1;//3
	
	
	 
	}
	
	
	}
	
	
	
