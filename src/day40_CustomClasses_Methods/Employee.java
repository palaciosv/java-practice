package day40_CustomClasses_Methods;

public class Employee {

 public	String name;// public means it can be used everywhere
 public String jobTitle;
 public double salary;
	
	public void work() {
		System.out.println(name+ " is working hard...");
	}
	
	public void attendMeeting() {
		System.out.println(name+ " is attending meeting...");
	}
	
	public void introduce() {
		System.out.println("Name: "+ name+", "+ "Job Title: "
	+jobTitle+ ", Salary: "+ salary);
	}
	public static void main(String[] args) {
		
	}
}
