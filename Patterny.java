import java.util.Scanner;
public class Patterny
{
	public static void main(String[] args) {
		
   int n,i,j;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      int k=n,N=(n/2)+1,x=n;
     for(i=1;i<=N;i++){
         
         for(j=1;j<=n;j++){
             if(i==j||j==k){
                 System.out.print(k);
             }
             else{
                  System.out.print(" ");
             }
         }
         System.out.print("\n");
        x--;
         k--;
     }
     

     int z=k+2;
     for(i=N+1;i<=n;i++){
         
         for(j=1;j<=n;j++){
             if(i==j||j==k){
                 System.out.print(z);
             }
             else{
                  System.out.print(" ");
             }
         }
         System.out.print("\n");
         z++;
        x--;
         k--;
     }
     
	}    } 
