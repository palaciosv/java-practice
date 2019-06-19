package day24_loopsandarrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[]args) {
		
		        // TODO Auto-generated method stub

		        //BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		        
		        //1. create an array of strings, and store cars inside that array
		        
		        String[] cars= {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		        cars[0]="Opel";
		        
		        //2. print car names that starts with M
		        for(String carNames:cars) {
		            
		            if(carNames.startsWith("M")) {
		                System.out.println(carNames);
		            }
		        }
		        System.out.println("===============");
		        
		        //3. print all cars that have letter "r" somewhere in the name
		        //please make your search case insensitive
		        
		        for(String make: cars) {
		            if( make.toLowerCase().contains("r")) {
		                System.out.println(make);
		            }
		        }
		        System.out.println("===============");
		        //4. print car names that ends with "a"
		        
		        for(String c: cars) {
		            if(c.toLowerCase().endsWith("a")) {
		                System.out.println(c);
		            }
		        }
		        System.out.println("===============");
		        
		        //5. print all cars that have at least 6 letters in the name
		        
		        for(String car:cars) {
		            if( car.length()>=6) {
		                System.out.println(car);
		            }
		        }
		        System.out.println("===============");
		        
		        //6. Swap first and last value in the array
		        //before: BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		        //After: Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, BMW
		        
		        String temp= cars[0]; //create a temp variable that will get the value of first value
		        cars[0]=cars[cars.length-1]; //assign last value into the first value
		        cars[cars.length-1]=temp;// assign temp to last value
		        System.out.println(Arrays.deepToString(cars)); //first and last value are swapped
	System.out.println("===================");
		        System.out.println("Before sorting");
		        System.out.println(Arrays.toString(cars));
		        Arrays.sort(cars);
		        System.out.println("After sorting");
		        System.out.println(Arrays.toString(cars));
						}}
	

