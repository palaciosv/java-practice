package replit;

public class Replit_161_MethodsWReturn {

	
	
	  public static double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	    //your code here
	    if(units<50){
	      bill=units*.60;
	      
	     
	    }if(units>50&&units<100){
	      bill=units*.90;
	     
	      
	    }if(units>100&&units<150){
	   
	    bill=(units*.90)+50;
	  
	    
	    }if(units>150){
	      
	      bill=(units*.90)+100;
	     
	    
	    }
	    
	    
	    
	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax

	  
	
}
