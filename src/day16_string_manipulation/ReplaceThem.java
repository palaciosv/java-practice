package day16_string_manipulation;

public class ReplaceThem {
	public static void main (String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ","");
		//makes it so that theres no space
		System.out.println(withNoSpaces);
		System.out.println(sentence);
		//replace , with !
		sentence = sentence.replace("," , "!!!");
		System.out.println(sentence);
		
		String mixed = "^%&^%#ja^$v^%a*#&@&^";
		//clean up mixed
		mixed= mixed.replace("^%^%", " ");
		System.out.println(mixed);
		mixed = mixed.replace("#&@&", " ");
		
	mixed = mixed.replace("^","").replace("$","").replace("%", "").replace("&", "");
	System.out.println(mixed);
	
	String result = "About115,000,000 results (0.59 seconds)";
	//using replace, get number of results
	//115,000
	result = result.replace("About", "");
	//result = result.replace(" results(0.66 seconds)", "");  ----might break
	result = result.substring(0,result.indexOf(" "));// starts from beginning until the space" "
	System.out.println(result);
	
	result = result.replaceFirst(",", "");
	System.out.println(result);// replaced first , with nothing
	}
}
