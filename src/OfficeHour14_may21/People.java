package OfficeHour14_may21;

public class People {
	String hardToGet="Nursultan";
	
	static String easyToGet = "Muhtar";
public void sayMyName() {
	System.out.println(hardToGet);
	System.out.println(easyToGet);
}
public static void whatMyName() {
	System.out.println(easyToGet);
	//next line will throw error because static method 
	//cannot call non-static
}





}
