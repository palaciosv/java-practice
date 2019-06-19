package day55_abstraction;

public abstract class Mammal extends Animal {
public Mammal(String name) {
	super(name);
}

public abstract void productAMilk();
public abstract void eat();
}