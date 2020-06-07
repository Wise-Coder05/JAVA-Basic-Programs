	import java.util.Scanner;
	public class Prime
	{
		public static void main(String[] args) 
		{
                        Scanner sc = new Scanner(System.in);
			long number = sc.nextInt();
			long count=0;
			for(long iterator=2; iterator<=number; iterator++)
			{
				if(number%iterator==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(number+ " is a prime number");
			}
			else 
			{
				System.out.println(number+ " is not a prime number");
			}
                 }
          }
