package Fundamental_Review_OOP;
import java.util.*;
public class ControlPanel {
public static void main(String[] args) {
	//this our network of hotdog stands
	HotDogStand[] stands =new HotDogStand[3];
	int cart=0;
	String command="";
	stands[0]= new HotDogStand(0, 0);
	stands[1]= new HotDogStand(1,0);
	stands[2]= new HotDogStand(2,0);
	
	Scanner scan=new Scanner(System.in);
	
	while(true) {
	System.out.println("Enter command: ");
	command=scan.next();
	
	if(command.equals("sold")) {
		System.out.println("Enter cart number");
		 cart=scan.nextInt();
		 stands[cart].justSold();
	}else if(command.equals("print")) {
		System.out.println("Enter cart number: ");
		cart=scan.nextInt();
		System.out.println("cart sold: " +stands[cart].getSold());
	}else if(command.contentEquals("Print all")) {
		System.out.println("Total sold:"+HotDogStand.getTotal());
	}else {
		return;
	}
}}
}
