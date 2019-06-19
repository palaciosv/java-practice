package day35_review;

public class DecryptionFun {
	public static void main(String[] args) {
	System.out.println(decryptSentence("r olev qzez"));
	System.out.println(decryptSentence("szev z tllw wzbm"));
	System.out.println(decryptSentence("ovgh tl slnv"));
	System.out.println(decryptSentence("dv ziv hgfwvmgh lu xbyvigvp hxsllo"));
	System.out.println(decryptSentence("gszmp blf"));
	System.out.println(decryptSentence("glwzb xozhh rh ufm"));
	
	}

	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String decrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt( alphabet.indexOf(ch) );
		int i = alphabet.indexOf(ch);
		char ret = decrypted.charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += decryptChar(word.charAt(i));
		}
		return cyphered;		
	}
	
	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
	
}

