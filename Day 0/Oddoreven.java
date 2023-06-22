import java.util.*;
class Oddeven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
           System.out.println("Yes");
        else
           System.out.println("No");
    }
}