import java.util.*;
public class Courses
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
		    int co=obj.nextInt();
		    int u=obj.nextInt();
		    int ch=obj.nextInt();
		    System.out.println(co*u*ch);
                }
	}
}
