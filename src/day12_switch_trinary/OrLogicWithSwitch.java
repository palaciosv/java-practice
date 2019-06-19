package day12_switch_trinary;

public class OrLogicWithSwitch {
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	char grade='D';
    
    switch(grade){
    case 'A':
    case 'B':
    case 'C':
        System.out.println("Pass");
        break;
    case 'D':
    case 'F':
        System.out.println("Fail");
        break;
    default: System.out.println("invalid grade!");
    }

}}
