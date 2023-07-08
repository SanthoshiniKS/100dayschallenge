import java.util.*;
class Jenga {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=obj.nextInt();
            int t=obj.nextInt();
            if(t%p==0) 
               System.out.println("YES");
            else
               System.out.println("NO");
        }
    }
}
