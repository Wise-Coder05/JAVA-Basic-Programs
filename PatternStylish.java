import java.util.Scanner;
class A
{
    void fun(int d)
    {
    int i, j, k, s;
    
    for (i =1; i<=d; i++)
    {
		for (j =1 ; j <= d; j++)
		{
		    
		if(i==j || i+j==d+1)
		System.out.printf("*");
		else
		System.out.printf(" ");
		}
		System.out.printf("\n");
		}  
        
    }
}
class Main
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		A obj=new A();
		obj.fun(d);
	}
}
