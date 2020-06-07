import java.util.Scanner;

public class Overloading
{
public static void main(String args[])
{
Overloading obj = new Overloading();
int a = 5,b = 5;
int c = obj.add(a,b);
System.out.println(c);
int d = obj.add(a,b,c);
System.out.println(d);
}
public static int add(int a, int b)
{
System.out.println("Method Calling 1");
return(a+b);
}
public static int add(int a, int b, int c)
{
System.out.println("Method Calling 2");
return(a+b+c);
}
}