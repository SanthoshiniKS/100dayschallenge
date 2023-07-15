import java.util.*;
class SecMax{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            if((b>=a && a>=c)||(b<=a && a<=c))
                System.out.println(a);
            else if((a>=b && b>=c)||(a<=b && b<=c))
               System.out.println(b);
            else
               System.out.println(c);
        }
    }
}
