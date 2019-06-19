package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
public static void main(String[] args) {

	showMe5Numbers();
	pushUps();
	pushUps();
	
	rangePrint();
	
//while(true){
//showMe5Number();}
	// this example will run the loop infinitely

}
	
public static void showMe5Numbers(){
	Random r = new Random();
for (int i=1;i<=5;i++) {
	System.out.print(r.nextInt(1001)+", ");//print between ran number 0 to 1000
}}
public static void pushUps() {
System.out.println();// take it to new line
int count =1;
for (int j=1;j<=10;j++) {
	
	System.out.println("Push ups: " +count);
		count++;}
		System.out.println("Time to rest");

}
public static void rangePrint() {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 2 integers.");
	
	int num1= scan.nextInt();
	int num2= scan.nextInt();
	if (num1<num2) {
		for(int i = num1;i<=num2;i++) {
			System.out.println(num1);
			
			int count = num1++;}
		} else if (num2<num1){
			for(int j =num2;j<=num1;j++) {
				System.out.println(num2);
				int count2=num2++;}
				}else {
					System.out.println("Equal");
				}
		
	
		System.out.println();
}}

