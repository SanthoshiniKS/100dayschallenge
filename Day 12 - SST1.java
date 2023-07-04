import java.util.*;
class SST {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=obj.nextInt();
            int b=obj.nextInt();
            a=a*10;
            b=b*5;
            if(a>b)
               System.out.println("FIRST");
            else if(a<b)
               System.out.println("SECOND");
            else
               System.out.println("ANY");
        }
    }
}
