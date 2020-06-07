import java.util.*;
public class Div 
{
	Div()
	{
		this(10);
		System.out.println("This is a Constructor");
	}
	Div(int a)
	{
		this("",90);
		System.out.println("This is a Parameterized Constant");
	}
	Div(String B,int b)
	{
		System.out.println("neavil");
	}
	public static void main(String args[]){
                Div obj = new Div();
                Div obj2 = new Div();
        }

}
