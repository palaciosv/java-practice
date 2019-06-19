package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {

//	1) American: Ford, Dodge, Tesla, Chevrolet, Lincoln
//AveragePrice:33000
	
//	2)Japanese: Toyota, Mitsubishi, Honda, Subaru, Mazda
//	AveragePrice:32000
	
//	3) German: BMW, VW, Audi, Mercedes, Porsche
//	AveragePrice:55000
	
//	4) Italian:AlfaRomeo, Ferrari, Lamborghini, Fiat
//	AveragePrice:85000
//	5) Korean: Kia, Hyundai, Daewoo
//	AveragePrice:25000
	
	  public static void main(String[] args) {
		 Scanner keyboard= new Scanner(System.in);
				 
				 System.out.println("Which type of car are you interestedin?");
				 System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
				 
		  int carType= keyboard.nextInt();
		  double averagePrice = 0.0;
		  String carOptions =  "";
		  String carOrigin ="";
		  
	  switch(carType){
	  
	  case 1:
		  carOrigin = (" American");
		  averagePrice =33000.0;
		  carOptions = ("Ford, Dodge, Tesla, Chevrolet, Lincoln");
	  break;
	  
	  case 2:
		  carOrigin = (" Japanese");
		  averagePrice =32000.0;
		  carOptions= ("Toyota, Mitsubishi, Honda, Subaru, Mazda");
	  break;
	  case 3:
		  carOrigin = (" German");
		  averagePrice= 55000.0;
	  	carOptions= ("BMW, VW, Audi, Mercedes, Porsche");
	  	break;
	  	case 4:
	  	carOrigin =(" Italian");
	  	  averagePrice= 85000.0;
	  	carOptions= ("AlfaRomeo, Ferrari, Lamborghini, Fiat");
	  	break;
	  	case 5:
	  		carOrigin = (" Korean");
	  	  averagePrice= 33000.0;
	  	carOptions=(" Ford, Dodge, Tesla, Chevrolet, Lincoln");
	  	break;
	  	default:
	  		System.out.println("Car type not available");
	  	return;// Stops execution
	  }
	  
	  System.out.println("You selected"+ carOrigin+ " car and your options are " + carOptions+".");
	  
	  System.out.println("Average price: "+ averagePrice);
	  
	  
	  }}






