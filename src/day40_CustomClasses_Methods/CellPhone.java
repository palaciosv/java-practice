 	package day40_CustomClasses_Methods;

public class CellPhone {
	
public void call() {
	System.out.println("Calling....");
}

public void message() {
	System.out.println("Sending text message...");
}
public void takeAPhoto() {
	System.out.println("Taking a photo....");	
}


//cellphone:
//attributes/data/inst variable
// brand
	//screensize
	//color
	//price
	
	//instancee variable: a variable that is declared in the class and outside and method
					
				 // default value
	String brand;//null
	double screenSize;//0.0
	String color;//null
	double price;// 0.0
	
	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
	
		cell1.brand= "Nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="Silver";
		cell1.price=76.16;
		
		System.out.println("Brand: "+cell1.brand);
		System.out.println("Screen size: "+cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Price: "+ cell1.price);
		
		CellPhone cell2= new CellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="blue";
		cell2.price=39.22;
		System.out.println("*****Cell 2 values*********");
		System.out.println("Brand: "+cell2.brand);
		System.out.println("Screen size: "+cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Price: "+ cell2.price);
		
		System.out.println("**Calling methods**");
		cell1.call();
		cell1.message();
		cell2.call();
		cell2.takeAPhoto();
		
	}
}
