package day42_customclasses_encapsulation;
import java.util.*;
public class StringShoestoObject {
public static void main(String[] args) {
	//create shoe object and assign the data from the
	//string data
	String data= "Bruno Magli, 9.5";
	//split using comma and store into thearray
	String [] arrData=data.split(",");
	//create shoes obhect
	Shoes shoes= new Shoes ();
	//shoes.setShoesdata(arrData[0], Double.parseDouble(arrData[1]));
	
	//above is the same as below
	//different way of doing the same thing
	shoes.brand=arrData[0];
	shoes.size=Double.parseDouble(arrData[1]);
	System.out.println(shoes.getShoesData());

	Scanner scan = new Scanner (System.in);
	 
	System.out.println("What shoes brand?");
	
	String brand= scan.next();
	System.out.println("What is your size?");
	double size= scan.nextDouble();
	
	//create object using data from scanner
	Shoes myShoes = new Shoes();
	myShoes.setShoesdata(brand,size);
	System.out.println(myShoes.getShoesData());
	
}
}
