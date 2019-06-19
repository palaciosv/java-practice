package day07_scanner_operators;

public class PreAndPost {

public static void main (String[]args){
	int num= 0;
	int num2= num++;
System.out.println("num: " + num);

System.out.println("num2: " + num2);
int n=0;
int n2= ++n;
System.out.println("n: " +n);
System.out.println("n2: "+n2);
	
	int i=10;
	i++;// increase by one
	++i;// add by one
	
	System.out.println("I value: "+ i);
	
	
	
	int bananas = 6;
	int apples = bananas++;
	int pears = ++bananas;
	
	System.out.println("bananas: "+ bananas);
	System.out.println("pears: "+ pears);
	System.out.println("apples: "+ apples);
	
	int friends = 10;
	System.out.println(++friends);
	System.out.println(friends);
	int p1 = 10;
	int sum = p1++ + 5;
	
	System.out.println("sum: " + sum);
	System.out.println("p1: " +p1);
	
//=========================================================
	
	int batteries =8;
	int oldBatteries = 5;
	int totalBatteries = batteries++ + ++oldBatteries;
	System.out.println("batteries: " + batteries);
	System.out.println("oldBatteries: " + oldBatteries);
	System.out.println("totalBatteries: " + totalBatteries);
	
	
//=====================================================
	

}
}