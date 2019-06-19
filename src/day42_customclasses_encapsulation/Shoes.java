package day42_customclasses_encapsulation;

public class Shoes {
String brand;
double size;

public void setShoesdata(String newBrand, double nSize) {
	brand=newBrand;
	size=nSize;
}

public String getShoesData() {
	return brand + " | " + size;
	
}
}
