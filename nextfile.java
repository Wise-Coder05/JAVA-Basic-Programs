import java.util.*;
public class Div {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Div f = new Div();
        int result = f.factorial(4);
        System.out.println("Result : "+result);
	}
	public int factorial (int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			System.out.println("The Process is : " +n);	
			int k = n*factorial(n-1);
			System.out.println("The Recursive Value is : " +k);
			return n*factorial(n-1);
			
		
			
		}
	}
}
