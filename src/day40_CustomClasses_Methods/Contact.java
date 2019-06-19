package day40_CustomClasses_Methods;

public class Contact {

	String name="";
	String phoneNumber= "";
	String email = "";
	
	
	public void Call() {
		System.out.println("Calling "+ name+ " ...");
		
	}
	
	public void sendMessage() {
		System.out.println("Sending message to "+phoneNumber+"...");
		
	}
	
	public void sendEmail() {
		System.out.println("Sending Email to "+ email+"  ...");
	}
	public static void main(String[] args) {
	
}
}
