package day23_loopsandarrays;
import java.util.*;
public class CalculateSum {
	public static void main(String[] args) {
		//  
		//program that will calculate sum of 6 numbers 
		//if number is less or equal to 0, ignore
		// we need to ask them to provide numbers
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i=0; i<6; i ++){
			System.out.println("Enter a number: ");
			num= scan.nextInt();
			if(num<=0) {
				continue;
			}
			sum+= num;
			}
			System.out.println("Total sum: " + sum);
		}
		
	
}
