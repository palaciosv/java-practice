package day16_string_manipulation;

public class ExtraEnd {
	public static void main (String[] args) {
		String str = "java";
		String result = "";
		if (str.length()==2) {
			result = str+str+str;
		}else {
			result = str.substring(str.length()-2);
			result+= result+result;
		//+= is like saying =result+result+result
			//shortcut
		System.out.println(result);
		}
	}
}
