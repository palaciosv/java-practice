package replit;
import java.util.*;
public class Replit_29 {

	//a console menu is basically a text menu. after it is outputted to the console a user input is captured.

//then the program decides what to do according to the user input (what the user selected).

//this is done using separate if statements(without else) or branched if statements.

//our console menu has 3 items called "options"




Then using scanner, user will enter 1, 2 or 3

if choice is 1

print:
user selected 1

if choice is 2

print:
user selected 2

if choice is 3

print:
user selected 3

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("---------------");
    System.out.println("select an option:");
    System.out.println("1) option 1");
    System.out.println("2) option 2");
    System.out.println("3) option 3");
    System.out.println("---------------");
    
    int choice = s.nextInt();

    if choice == 1 {
    	System.out.println("user selected 1");
   
    
    }
	
	
	
	
	
}
