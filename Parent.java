import java.util.*;
public class Parent {
	static int a=0;
	public void inc()
	{
		System.out.println("Parent Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.print();

	}

}
class Child extends Parent{
	void print()
	{
		System.out.println("Child");
	Parent obj= new Parent();
	obj.inc();
	}
}