package day22_loopspractice2;

public class FindHowManyUsingReplace {
public static void main (String[] args) {
	
	String word = "including webpages, images";
	//find how many e characters in the word
	//get the length of word
	//replace all empty spaces
	//get the length of word without d
	//do a minus
	int length1 = word.length();
	word= word.replace("e", "");
	int length2 = word.length();
	System.out.println("length 1: " + length1);
	System.out.println("lenth 2: " + length2);
int count =length1-length2;
System.out.println("Count: "+ count);

}
}