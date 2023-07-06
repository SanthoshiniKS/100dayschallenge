import java.util.*;
class Qualify{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            int x=obj.nextInt();
            int a=obj.nextInt();
            int b=obj.nextInt();
            if((a*1+b*2)>=x)
            System.out.println("Qualify");
            else
            System.out.println("Not Qualify");
            n--;
        }
    }
}
