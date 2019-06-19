package day25_arrays03;

public class Population {
	public static void main(String[] args) {
	
	int[] population= new int[5];
	population[0] = 5000;
	population[1]= 10000;
	population[2]=7000;
	population[3]=4455;
	population[4]=8907;
			System.out.println("city 1 Population: "+population[0]);
			System.out.println("city 2 Population: "+population[1]);
			System.out.println("city 3 Population: "+population[2]);
			System.out.println("city 4 Population: "+population[3]);
			System.out.println("city 5 Population: "+population[4]);
		
			int idx=0;
			System.out.println("city o population: " + population[idx]);
			idx++;
			System.out.println("city 1 population: "+ population[idx]);//10
			
			
			
			String str= "abc";
			System.out.println("City STR population: "+ population[str.length()]);//502
			
			//string array called cities="miami","london","tokyo","rome","new york"
			
			String[] cities= {"miami","london","tokyo","rome","new york"};
			//population of Miami is 5000
			
			//population of miami is 5000, population of london is 10000,
			//population of tokyo is 7000, population of rome is 4455,population of new york is 8907
			System.out.println("Population of "+ cities[0]+" is "+population[0]);
			System.out.println("Population of "+ cities[1]+" is "+population[1]);
			System.out.println("Population of "+ cities[2]+" is "+population[2]);
			System.out.println("Population of "+ cities[3]+" is "+population[3]);
			System.out.println("Population of "+ cities[4]+" is "+population[4]);
}
}