import java.util.*;
class Salary{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int s=obj.nextInt();
            double hra,da,g;
            if(s<1500)
            {
                hra=s*0.1;
                da=s*0.9;
            }
            else
            {
                hra=500;
                da=s*0.98;
            }
            g=s+hra+da;
            System.out.format("%.2f",g);
        }
    }
}
