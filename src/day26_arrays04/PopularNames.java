package day26_arrays04;
import java.util.Arrays;
import java.util.Random;
public class PopularNames {
	public static void main(String[] args) {
		
	String[] names = {"James","Mary","John","Patricia","Robert","Jennifer",
	"Michael","Linda","William","Elizabeth","David","Barbara","Richard","Susan","Joseph","Jessica",
	"Thomas","Sarah","Charles","Margaret","Christopher","Karen","Daniel","Nancy","Matthew","Lisa",
	"Anthony","Betty","Donald","Dorothy","Mark","Sandra","Paul","Ashley","Steven","Kimberly",
	"Andrew","Donna","Kenneth","Emily","George","Carol","Joshua","Michelle","Kevin","Amanda",
	"Brian","Melissa","Edward","Deborah","Ronald","Stephanie","Timothy","Rebecca","Jason","Laura",
	"Jeffrey","Helen","Ryan","Sharon","Jacob","Cynthia","Gary","Kathleen","Nicholas","Amy",
	"Eric","Shirley","Stephen","Angela","Jonathan","Anna","Larry","Ruth","Justin","Brenda",
	"Scott","Pamela","Brandon","Nicole","Frank","Katherine","Benjamin","Samantha","Gregory","Christine",
	"Raymond","Catherine","Samuel","Virginia","Patrick","Debra","Alexander","Rachel","Jack","Janet",
	"Dennis","Emma","Jerry","Carolyn","Tyler","Maria","Aaron","Heather","Henry","Diane","Jose","Julie",
	"Douglas","Joyce","Peter","Evelyn","Adam","Joan","Nathan","Victoria","Zachary","Kelly",
	"Walter","Christina","Kyle","Lauren","Harold","Frances","Carl","Martha","Jeremy","Judith",
	"Gerald","Cheryl","Keith","Megan","Roger","Andrea","Arthur","Olivia","Terry","Ann","Lawrence","Jean",
	"Sean","Alice","Christian","Jacqueline","Ethan","Hannah","Austin","Doris","Joe","Kathryn",
	"Albert","Gloria","Jesse","Teresa","Willie","Sara","Billy","Janice","Bryan","Marie","Bruce","Julia",
	"Noah","Grace","Jordan","Judy","Dylan","Theresa","Ralph","Madison","Roy","Beverly",
	"Alan","Denise","Wayne","Marilyn","Eugene","Amber","Juan","Danielle",
	"Gabriel","Rose","Louis","Brittany","Russell","Diana","Randy","Abigail","Vincent","Natalie",
	"Philip","Jane","Logan","Lori","Bobby","Alexis","Harry","Tiffany","Johnny","Kayla"};
	//print number of names in array
	System.out.println("Total names: "+names.length);//200
	//print out names in single line
	System.out.println(Arrays.deepToString(names));//instead of using loop
	//Print in column format
	//2 names in each line
	
for(int i=0;i<names.length;i+=2) {
		System.out.println(names[i]+","+names[i+1]);
		}
	// print all male names
		for (int m=0;m<names.length;m+=2) {
		System.out.println(names[m]+",");
	}
	
	//print female names
		System.out.println("\nFemale NAMES: ");
for (int idx = 0; idx < names.length;idx++) {
	if(idx%2==1) {
		if(idx == names.length-1) {
			System.out.println(names[idx]);
		}else {
		System.out.println(names[idx]+",");
		}}// this will make it so that there is no comma on the last one
		//print one random name from this array
		//use random class
	System.out.println(("\nRandom Name"));
	Random random = new Random();
	
	int r = random.nextInt(names.length);
	System.out.println("Random name: "+names[r]);
	//print all namethat are up to 4 characters in uppercase, in same line
	for (String name :names) {
		if(name.length() <=4) {
			System.out.println(name.toUpperCase() + ",");
			
		}
	}
	System.out.println("\nNames Length Sort");
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";

for (String name:names){
	if(name.length()<=4) {
		namesUpto4+=name+", ";
		//do not jut compile by usingequal use +=
	}else if(name.length()==5 || names.length ==6){
		names5to6+=name+", ";
	}else {
		names7orMore+=name+", ";
		
			}
}
		System.out.println("Names up to 4:" + namesUpto4.substring(0,namesUpto4.length()-2));	
		// the last bit takes out comma at the end
		System.out.println("Names 5 to 6:  "+names5to6);
		System.out.println("Names 7 or more: "+names7orMore);

		// shows all names in one line-- turns to string
		System.out.println(Arrays.toString(names));
		
		//switch male and female names
		for (int i = 0; i < names.length; i+=2) {
			String temp = names[i];
			names[i]=names[i+1];
			names[i+1]=temp;
		
		}
		System.out.println(Arrays.toString(names));

}
}}