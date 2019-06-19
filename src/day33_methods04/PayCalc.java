package day33_methods04;

public class PayCalc {
	
public static void main(String[] args) {
	
	int pay= getHourlyPay(0,50);
	System.out.println("Total pay for 40 hours: "+ pay);
	System.out.println(getHourlyPay(0,10));
	int noPay= getHourlyPay(10,0);
	System.out.println("No pay: "+noPay);
	
//Method: getHourlyPay
//Return Type:int
//params: int hours, int rate
//return total pay by multiplying hours*rate
// if hours is 0 or negative print"invalid hours"
// return 0;

// if rate is 0 or negative
//print "invalid rate"
//	return 0;
}




public static int getHourlyPay(int hours, int rate) {
	if(hours<=0) {
		System.out.println("Invalid hour");
		return 0;// exit method and return 0
	}if(rate<=0){
			System.out.println("Invalid rate");
		return 0;
		}
	
	
	 int totalPay=hours*rate;
	 return totalPay;
	
}
}
