package day17_stringpool_whileloop;

public class StairCase {
	public static void main (String [] args) {
		/*
		 **
		 ***
		 ****
		 *****
		 
		 */
	
	String stairs = "*";
	System.out.println(stairs);
	//stairs++; we cannot do ++ with a string
	stairs = stairs+"*";
	System.out.println(stairs);
	
	stairs+="*";
	//1) with a counter
	int num = 1;
	while(num<= 10) {
		System.out.println(stairs);
		stairs +="*";
		num++;
	}
	//2)checking length()
	stairs= "*";
	while(stairs.length()<=10) {
		System.out.println(stairs);
		stairs+="*";
	}

	}
	
	
	
}
