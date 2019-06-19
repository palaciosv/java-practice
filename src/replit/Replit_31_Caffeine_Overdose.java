package replit;
import java.util.*;
public class Replit_31_Caffeine_Overdose {
    public static void main(String[] args) {
		
	
  Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of milligrams in drink:");
    int drink=scan.nextInt();
    int lethal=10000/drink;
 
    
    System.out.println("It would take about "+lethal+" drinks for a lethal overdose.");
    
    
  }

}
