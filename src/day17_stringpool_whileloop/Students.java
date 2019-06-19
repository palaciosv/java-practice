package day17_stringpool_whileloop;

public class Students {
	public static void main(String[] args) {
		int numberofStudents =1;
		// using  loop, iterate until we have 10 students
		//in the room
		//stuent1
		//student2
		
	while(numberofStudents<=10) {
		System.out.println("Student: " +numberofStudents);
		++numberofStudents;
		System.out.println("No more space");// prints between loop
	}
	//System.out.println("No more space");// prints at the end of loop
	
}
}