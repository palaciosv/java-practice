package day42_customclasses_encapsulation;

public class Person {
//declare name and age encapsulated data
private String name;
private int age;

//getter and setter methos for name
//red only

public String getName() {
	return name;
}

//write only- void
public void setName(String name) {
	this.name=name;
}
}
