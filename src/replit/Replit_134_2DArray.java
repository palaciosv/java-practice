package replit;
import java.util.*;
public class Replit_134_2DArray {
	

	
	  public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    String [] count = {"1","2","3","4","5","6","7","8"};
		String [] countChar = {"a","b","c","d","e","f","g","h"};
	    //WRITE YOUR CODE HERE
	    // Given a 8x8 two-dimensional array of strings named chessboard.
	    // Initialize values inside an array accordingly to the chess board.
	    // So first element in the array, chessboard[0][0] should have a value "1a",
	    // and last element in the array, chessboard[7][7] should have a value "8h". 
	   for(int i =0; i<chessBoard.length;i++) {
		   for(int j=0;j<chessBoard[i].length;j++) {
			   chessBoard[j][i]= count[j]+countChar[i];
		   }
	   }
	   
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	 
	 
	  }
	}

