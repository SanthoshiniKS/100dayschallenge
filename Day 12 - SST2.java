import java.util.*;
class SST {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            double a=obj.nextDouble();
            double b=obj.nextDouble();
            a=a/0.1;
            b=b/0.2;
            if(a>b)
               System.out.println("FIRST");
            else if(a<b)
               System.out.println("SECOND");
            else
               System.out.println("ANY");
        }
    }
}
