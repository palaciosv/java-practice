package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {
public static void main(String[] args) {
	String[][] pizzas = {
			{"pineapple","pepperoni"},
			{"anchovies","mushroom","olives"},
			{"4 cheese"},
			{"chicken","tomatoes", "jalopenos","onions"},
			{"green peppers", "zucchini", "broccoli", "spinach", "shrimp"}
				};
	
	
	//System.out.println(Arrays.deepToString(pizzas[0]));
		for (String[] pizza:pizzas) {
			
			System.out.print(pizza.length+"-");// will print out how many toppings per option
			System.out.println(Arrays.deepToString(pizza));
			//will print all rows of arrays
			
			
		}
		System.out.println("********FOR LOOP*********");	
			for(int i = 0; i <pizzas.length;i++){
				System.out.print(pizzas[i].length + "-");
				
				System.out.println(Arrays.toString(pizzas[i]));
				
				//same thing with for loop
			}
			for(String toppings : pizzas[0]){
				System.out.println(toppings);			}
			
			int[][] students = {{4,5,6},
								{112,54,76},
								{23,55,12,55,3}};
			
			//2 PARTS: OUTER LOOP AND INNER LOOP
			//OUTER LOOP WILL TAKE EACH GROUP
			//INNER GROUP WILL TAKE EACH VALUE.STUDENT ID
			for(int[] group:students) {
				for(int studentsID:group) {
				System.out.println(studentsID+ ",");
				
				}
			System.out.println();	
			}
				int[][] nums = {{10,20},//array0
						     	{20,30,40,50},//1
								{100,200,400},//2
								{555,333,111,444,666,78}};	//3
			
			for(int i = 0;i<nums.length;i++) {
				for(int j = 0;j<nums[i].length;j++) {
					System.out.println(nums[i][j]+" ");
				}
			System.out.println();
			}
}
}
