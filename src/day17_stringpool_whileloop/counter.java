package day17_stringpool_whileloop;

public class counter {

	public static void main (String[] args) throws InterruptedException {
	int num =1;
	while(num<= 10) {
		System.out.print(num+", ");
		num++;
	Thread.sleep(1000);// clicked on throw, added throw// paused code execution with a second
	}
	System.out.println("Num value after loop:"+num);
	//11,10,9,8,,6,5,4,3,2,1,
	int num2 = 11;
	
	while(num2>=1) {
		System.out.print(num2+",");
		num2--;
		Thread.sleep(456);
		
		
	}}
}
