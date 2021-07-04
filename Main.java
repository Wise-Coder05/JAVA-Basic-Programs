import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//4
		int m = in.nextInt();//2
		int i,j,k;
		for(i=1;i<=n;i++)         //row
		{
		    for(k=n-1;k>=i;k--)
		    {
		        System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)     //col
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(i=1;i<=n;i++)         //row
		{
		    for(k=n-1;k>=i;k--)
		    {
                System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)     //col
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(i=1;i<=n;i++)         //row
		{
		    for(k=n-1;k>=1;k--)
		    {
		        System.out.print(" ");
		    }
		    for(j=2;j<=n-2;j++)     //col
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
