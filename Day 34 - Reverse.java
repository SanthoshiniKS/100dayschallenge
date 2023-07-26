import java.util.*;
class Reverseint {
    public static int reverse(int x){
        int num=x,rem=0,rev=0;
        if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE-1){
        if(x<0)
           x=Math.abs(x);
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(num<0) return (rev*(-1));
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(reverse(n));
    }
}