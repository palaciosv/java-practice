package day15_string_manipulation;

public class StartEndsWith {
public static void main (String[] args) {
	String word1= "eclipse";
	//startWITH  ===> TEST IF STRING STARTS WITH ANOTHER
	System.out.println(word1.startsWith("e"));//true
	System.out.println(word1.startsWith("ec"));//true
	System.out.println(word1.startsWith("ecli"));//true
	
	System.out.println(word1.startsWith("Ec"));//false

	System.out.println(word1.endsWith("e"));//true
	System.out.println(word1.endsWith("ipse"));//true
	   
	System.out.println(word1.endsWith("java"));//false
	//PSE
	System.out.println(word1.toUpperCase().endsWith("PSE"));
	
	System.out.println(word1.endsWith("ipse"));
	//Mr.== man
	//Mrs.== married      
	//Ms. == woman
	//Dr. ==  doctor man or woman
	// === unknown status
	String name = "Mr.Jackson";
	
	if(name.startsWith("Mr.")){
			System.out.println("Man");
	
	}else if(name.startsWith("Mrs.")){
			System.out.println("Married woman");
	}else if(name.startsWith("Ms.")) {
		System.out.println("woman");
	}else {
		System.out.println("Unknown");
		
	
	}
	}
	
	
			
	
}

