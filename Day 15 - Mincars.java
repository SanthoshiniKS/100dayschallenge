import java.util.*;
class Mincars {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int f=obj.nextInt();
            if(f<=4)
                System.out.println(1);
            else
            {
                if(f%4==0)
                  System.out.println(f/4);
                else
                 System.out.println((f/4)+1);
            }
        }
        
    }
}
