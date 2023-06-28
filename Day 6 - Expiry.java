import java.util.*;
class Expiry {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int N=obj.nextInt();
            int M=obj.nextInt();
            int K=obj.nextInt();
            if(N<=(M*K))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}