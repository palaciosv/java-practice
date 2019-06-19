package day22_loopspractice2;

public class SubStringPractice {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2));//ja
		//print each character in seperat lines
		System.out.println(word.substring(0,1));//j
		System.out.println(word.substring(1,2));//a
		System.out.println(word.substring(2,3));//v
		System.out.println("############################");
		int i =0;
		System.out.println(word.substring(i,i+1));//0,1  J
		i++;// 0 becomes 1
		System.out.println(word.substring(i,i+1));//A
		i++;
	
	System.out.println(word.substring(i,i+1));//v
	
	System.out.println("###########FOR LOOP###########");
	//Using for loop and substring, print each char
	//java
	//0123
	for(int n = 0; n<=3; n++) {
	//System.out.println(word.substring(n,n+1));
	String letter = word.substring(n,n+1);
	System.out.println(letter);
	//both are the same thing
	}
	
	System.out.println("###########REVERSE#########");
	
	// print letters in reverse
	//avaj
	
	for (int n=3;n>=0;n--) {
		System.out.println(word.substring(n,n+1));
	}
	
	int start =1;
	int end =5;
	String word2 = "UniteStates";
	System.out.println(word2.substring(start, end));
		
	
	
System.out.println(word2.substring(2,3));
System.out.println(word2.substring(6,7));
//pass single input. start only and will include until
System.out.println(word2.substring(6));
//prin last character


	
	}
}
