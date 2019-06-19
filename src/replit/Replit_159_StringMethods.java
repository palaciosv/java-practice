package replit;

public class Replit_159_StringMethods {
	public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	   String profit="";

	   
	if(buyPrice>sellPrice){
	  profit="loss";
	  return profit;
	}
	  if(sellPrice>buyPrice){
	    profit="profit";
	    return profit;
	  }
	  
	    if(buyPrice==sellPrice){}
	     profit= "no loss";
	    
	 
	   return profit;
	
}}
