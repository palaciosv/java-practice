package day59_polymorphism;

public class ShapeTests {
public static void main(String[] args) {
	Shape shape1=new Shape();
	shape1.draw();//general shape not polymorphism
	
	Shape circle = new Circle();
	circle.draw();//this is polymorphism/ override and and calling overridden version
	
	Shape triangle = new Triangle();
	triangle.draw();
	
	Square square= new Square();
	square.draw();
	
}
}
