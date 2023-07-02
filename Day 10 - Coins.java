import java.util.*;
class Coins{
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       for(int i=0;i<n;i++)
       {
           int x=obj.nextInt();
           int y=obj.nextInt();
           System.out.println((x*10)+(y*5));
       }
    }
}
