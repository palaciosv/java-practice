package day23_loopsandarrays;

public class PrintWord {
	public static void main(String[] args) {
		
		String word = "java";
		for (int i = 0; i<word.length()-1; i++)    {
			if(word.substring(i,i+1).equals("a")) {
				continue;
			}
		System.out.print(word.substring(i,i+1));
		}
		
		
	
	}
}
