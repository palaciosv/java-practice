package day42_customclasses_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {

public static void main(String[] args) {
	Shoes shoes1 = new Shoes();
	shoes1.setShoesdata("Aldo", 6.5);
	
	Shoes shoes2 = new Shoes();
	shoes2.setShoesdata("Allen Almonds", 7.5);
	
	Shoes shoes3 = new Shoes();
	shoes3.setShoesdata("Boss Hugo Boss", 9.0);
	
	System.out.println(shoes1.getShoesData());
	
	Shoes[] shoesArray = new Shoes [3];
	shoesArray[0]=shoes1;
	shoesArray[1]=shoes2;
	shoesArray[2]=shoes3;
	System.out.println(shoesArray[0].getShoesData());
	System.out.println(shoesArray[1].getShoesData());
	System.out.println(shoesArray[2].getShoesData());
	
	//arry list of shoes
	ArrayList<Shoes> myShoes = new ArrayList<>();
	myShoes.add(shoes1);
	myShoes.add(shoes2);
	myShoes.add(shoes3);
	
	System.out.println(myShoes.get(0).getShoesData());
	System.out.println(myShoes.get(1).getShoesData());
	System.out.println(myShoes.get(2).getShoesData());
	
	System.out.println(myShoes.get(0).size);
	System.out.println(myShoes.get(1).size);
	System.out.println(myShoes.get(2).size);
	
	Shoes redShoes = myShoes.get(1);
	System.out.println(redShoes.getShoesData()) ;
	
	// letsuse for each loop and pring data for each shoe
	for(Shoes shoes: myShoes) {
		System.out.println(shoes.getShoesData());
	}//pring name of shoes in the list that the size is more then 7
	
	for(Shoes shoes : myShoes) {
		if(shoes.size>7.0) {
			System.out.println(shoes.brand);
		}
	}
}
}
