package day47_blocks;

public class AllBlocks {
	int nonStaticInt;
	static int staticInt= 10;
	
static {
	System.out.println("Static block-I run first and only once");
	staticInt--;
}
{
	System.out.println("INIT Block- i run eachtime object is created before consturctor");
	nonStaticInt+=5;
	staticInt+=5;
}
public AllBlocks() {
	System.out.println("Constructor- i ruun ech time object is create after INIT");
	nonStaticInt+=3;
	staticInt+=3;
}
}
