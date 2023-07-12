import java.util.*;
public class Mincoins
{
	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=obj.nextInt();
            if(a%5==0)
            {
                if(a%10==0)
                    System.out.println(a/10);
                else
                {
                    System.out.println((a/10)+1);
                }
            }
            else
               System.out.println(-1);
        }
	}
}
