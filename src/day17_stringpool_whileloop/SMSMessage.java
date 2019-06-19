package day17_stringpool_whileloop;
import java.util.*;
public class SMSMessage {
public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
  
  //  String phoneNumber;
    //
 //Sender:<Mike Smith>. From Number:[202-123-3456]. 
    //Message:{I love programing and problem solving}
    String sender= message.substring( message.indexOf("<")+1 , message.indexOf(">"));
///find this "<" and add one and sub string means cut, 
System.out.println("Sender: "+sender);
String phoneNumber=message.substring( message.indexOf("[")+1 , message.indexOf("]"));
System.out.println("Phone Number: "+phoneNumber);

String messageBody=message.substring( message.indexOf("{")+1 , message.indexOf("}"));
System.out.println("Message body: "+messageBody);
}
}
