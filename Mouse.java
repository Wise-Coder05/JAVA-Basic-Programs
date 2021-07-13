//mouse to reach the destination
//it can travel thr right and down side only
//00 01 02
//10 11 12
//20 21 22
import java.util.*;
public class Mouse
{
    public static int ways(int cr,int cc,int r,int c)
    {
        if(cr>r || cc>c)
        {
            return 0;
        }
        if(cr==r && cc==c)
        {
            return 1;
        }
        return ways(cr,cc+1,r,c) + ways(cr+1,cc,r,c);
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(ways(0,0,m-1,n-1));
	}
}
