import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=obj.nextInt();
            int d=obj.nextInt();
            System.out.println(num%d);
        }
    }
}