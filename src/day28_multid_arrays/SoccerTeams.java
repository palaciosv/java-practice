package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {
public static void main(String[] args) {
	
	String[][] teams = new String[2][6];
	//2 teams,6 people
	// declare ultid arra with 2 rows and6 collumns
	teams[0][0]="Irina";
	teams[0][1]="Zarif";
	teams[0][2]="Cihan";
	teams[0][3]="Habib";
	teams[0][4]="Adel";
	teams[0][5]="Bojan";
	
	teams[1][0]="Olimjon";
	teams[1][1]="Mirshod";
	teams[1][2]="Usman";
	teams[1][3]="Nursultan";
	teams[1][4]="Roman";
	teams[1][5]="Dmitriy";
	
	System.out.println("First playerof first team: ");
	System.out.println(teams[0][0]);//irina
	System.out.println(teams[0][1]);//zarif
	System.out.println(teams[1][5]);//dmitry
	
	//print howmany/teams/arrays
	System.out.println("Number of rows:"+ teams.length);//2
	System.out.println("Peopleof in first Team: "+ teams[0].length);//6
	System.out.println("Peopl of in second team: "+teams[1].length);//6
	
	System.out.println(Arrays.deepToString(teams));
}
}
