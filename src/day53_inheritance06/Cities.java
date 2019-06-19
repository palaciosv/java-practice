package day53_inheritance06;

public class Cities {
public static void main(String[] args) {
	City Baku= new City(123,"Baku");
	System.out.println(Baku.toString());
	
	City istanbul= new City(444,"Istanbul");
	City anotherCity= new City(444,"Istanbul");
	if(istanbul.equals(anotherCity)) {
		System.out.println("Both are istanbul");
	}else {
		System.out.println("Does not equal");
	}
	System.out.println(istanbul.toString());
	System.out.println(anotherCity.toString());
	
	System.out.println(Baku.hashCode());// puts rANDOM number
	
	System.out.println(istanbul.hashCode());
	
	Capital cap= new Capital(202, "Washington Dc", 80_000L);;
	System.out.println(cap.toString());
}
}
