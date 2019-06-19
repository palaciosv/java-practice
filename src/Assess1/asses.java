package Assess1;
import java.util.*; v 
public class asses{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String model = scan.next();
	    int year = scan.nextInt();
	    boolean recalled = false;
	    
	    if (model=="Extravagant"){
	      if (year==2010||year==2011||year==2012){
	        recalled=true;
	      }
	    }

	if(model=="Guzzler"){
	if (year==2015||year==2016||year==2017||year==2018){
	  
	  recalled=true;
	  
	}
	  }
	  System.out.println(recalled);
	}}