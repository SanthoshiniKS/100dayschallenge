import java.util.*;
class Shoes {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int f=obj.nextInt();
            int l=obj.nextInt();
            if(l==0) 
               System.out.println(f*2);
            else if((f-l)>0)
            {
                System.out.println((f-l)+f);
            }
            else 
               System.out.println(f);
        }
    }
}
