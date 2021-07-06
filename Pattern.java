public class Pattern
{
	public static void main(String[] args) {
		int n = 7;
		int N = (n/2)+1;
		int a = N+1;
		//System.out.println(N);
		//System.out.println(a);
		for(int i=n;i>=1;i--)
		{
		    for(int j=n;j>=1;j--)
		    {
		        if(i==j)
		        {
		            if(i>=N)
		            {
		                System.out.print(i);
		            }
		            else if((i==j)&&(i<N))
		                System.out.print(a++);
		        }
		        else if((i+j==n+1)&&(i>=N))
		        {
		      
System.out.print(i);
		        }
		        else if((i+j==n+1)&&(i<N))
		        {
		            System.out.print(j);
		        }
		        else
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
