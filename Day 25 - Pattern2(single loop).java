import java.util.*;
class Pattern2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String a="* ";
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            a+="* ";
        }
    }
}
