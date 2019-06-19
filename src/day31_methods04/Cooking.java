package day31_methods04;

public class Cooking {

	public static void main(String[] args) {
	
		makePancakes();
		makePasta();
		cook("omelette","eggs,bsalt, tomatoes, green peppers, onions, scallions");
	}
	
		public static void cook(String dish,String ingredients) {
			System.out.println("*** "+ dish.toUpperCase()+"  Recipe**");
			add(ingredients);
			System.out.println("Cook it");
			System.out.println("**"+dish.toUpperCase()+" is ready!**");
		}
	
		
		public static void makePancakes() {
		
			System.out.println("***Pancake Recipe**");
			add("Milk, Eggs, Flour, Salt");
			mix(120);
			fry(3);

			System.out.println("** Enjoy your delicious pancakes! **");
			}
		
		public static void makePasta() {
			System.out.println("**Italian Pasta Recipe***");
			add("Water, Salt, Olive Oil");
			boil(2);
			add("Spaghetti Pasta");
			boil(9);
			mix(60);
			add("Parmesan Cheese");
			System.out.println("**Enjoy your pasta**");
			
		}
		
		public static void add(String ing) {
		System.out.println("Add "+ ing);
	}
	public static void mix(int seconds) {
	
		System.out.println("Mix for "+seconds+" seconds");
	}
	public static void fry(int minutes) {
		System.out.println("fry for " + minutes+ " minutes");
	}
	public static void boil(int minutes) {
	
}

}

