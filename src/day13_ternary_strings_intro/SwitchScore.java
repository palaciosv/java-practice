package day12_switch_ternary;

public class SwitchScore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int score=10;
        //if 1->
        //2->
        switch (score) {
            case 1:
                System.out.println("Score is 1");
                break; //exit from switch statement
            case 2:
                System.out.println("Score is 2");
                break;// doesn't mean stop the code
            case 3:
                System.out.println("Score is 3");
                break;
            default://if non of it matches then go to default
                System.out.println("Invalid Score");
                break;
        }
        
        //we need break; statements t the end of each case, otherwise code will continue
        //running without exiting each statement