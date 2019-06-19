package replit;

import java.util.Scanner;

class Replt_54 {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE
   
   Scanner scan= new Scanner(System.in);
    int month =scan.nextInt();
    
    switch(month){
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
      case 4:
        System.out.println("April");
    }
  }
}