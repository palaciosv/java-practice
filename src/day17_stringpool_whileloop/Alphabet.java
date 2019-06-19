package day17_stringpool_whileloop;

public class Alphabet {
	public static void main (String[] args) {
char letter = 'a';
//letter++ always ad to b,c,d etc.
	while (letter<='z') {
	System.out.print(letter+" ");
	letter++;
}
	System.out.println(" ");
	char capitals = 'A';
	while(capitals<='Z') {
		System.out.print(capitals+ " ");
		capitals++;
	}//print lowercase in reverse
	System.out.println(" ");
	char reverse = 'z';
	while(reverse>='a') {
		System.out.print(reverse+" ");
		reverse--;
	}
	/*A
	 * AB
	 * ABC
	 * ABCD
	 */
	System.out.println(" ");
	String letters = "";
	char myLetters = 'A';
	
	while(myLetters <='Z') {
	
	 letters = letters +myLetters;
	 System.out.println(letters);
	myLetters++;
	}



}}
