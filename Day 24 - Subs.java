import java.util.*;
class Subs {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=obj.nextInt();
            if(t<=30)
               System.out.println("NO");
            else
               System.out.println("YES");
        }
    }
}
