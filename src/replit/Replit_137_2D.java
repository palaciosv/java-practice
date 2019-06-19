package replit;
import java.util.*;
public class Replit_137_2D {
	


	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++){
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    int temp=0;
	    for(int i=0;i<arr.length;i++){
	      for(int j=0; j<arr[i].length;j++){
	        if(temp<arr[i][j])
	        	temp=arr[i][j];
	      }
	      
	    }
	    
	    for (int i=0;i<arr.length;i++) {
	    	for (int j=0;j<arr[i].length;j++)
	    		arr[i][j]=temp;
	    }
	    
	    //FINAL PRINT
	    System.out.println(Arrays.deepToString(arr));
	    
	   
	  }
	}