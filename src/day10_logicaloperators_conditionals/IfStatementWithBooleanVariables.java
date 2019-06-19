package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
public static void main(String[] args) {
	
	boolean isBreakTime = true;
	
	if(isBreakTime == true) {
		System.out.println("BREAK UNTIL 8:35PM");
	}else{
		System.out.println("Not Break time yet");
		
	}
	//second version
	
	if(isBreakTime) {//no need for ==1 because boolean variable
		System.out.println("BREAK UNTIL 8:35PM");
	}else{
		System.out.println("Not Break time yet");
		
	}
		boolean classTime = false;
		
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
			}else {
			System.out.println("Take a walk and have some water.");
		}
		boolean qualified = false;
		// send a notification message i not qualified
		// we need to checkc if wualified variable contains FALSE
	
		if(qualified == false) {
			System.out.println("Your application was not approved. Thank you");
		}
		
		boolean isNiceWeather = true;
		if(!isNiceWeather) {//false
			System.out.println("Dont go out fo running");
		}else{
			System.out.println("Lets go out for running");
		
		//	==========================
double price = 100;
boolean b = price> 200.0;//false
booleaan b2 = !(price>200.0);
		
			
			
			
		}
	
	}	
	
	
	
	
	
	
}

