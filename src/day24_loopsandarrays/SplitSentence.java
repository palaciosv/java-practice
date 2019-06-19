package day24_loopsandarrays;

public class SplitSentence {
	public static void main(String[]args) {
		int counter= 0;
		String sentence=
				"Java is a general-purpose computer-programming "
				+"language that is concurrent, class-based, object-orientd, "
				+"and specifically designed to have as "
				+"few implementation dependencies as possible.";

		//This is array of string
		String[] words = sentence.split(" ");
		for(String str: words) {
			if (str.contentEquals("language")) {
				break;
			}
			counter++;
		}
		System.out.println("position: " +counter);
		
		System.out.println(words[counter]);
		
	}
}
