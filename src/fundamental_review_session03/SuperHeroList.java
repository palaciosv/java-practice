package fundamental_review_session03;
import java.util.ArrayList;
import java.util.Arrays;

public class SuperHeroList {
	public static void main(String[] args) {
		
	// we created and object of superhero class
		//why?
		//because we want to get instance variables in superheroes
		//that sotres array of strings with superheroes names
		
		SuperHero object = new SuperHero();
		
		//we created and array list of string
		ArrayList<String> superheroes = new ArrayList<String>();
		
		//add All method allows to add whole array/listlist
		superheroes.addAll(Arrays.asList(object.superheroes));
	}
}