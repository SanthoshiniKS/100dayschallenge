import java.util.*;
class Palindrome {
    public static boolean isPalindrome(int n){
        int num=n,rem=0,rev=0;
        if(n<0)
           return false;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return num==rev;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(isPalindrome(n))
            System.out.println("true");
        else
            System.out.println("false");
    }
}