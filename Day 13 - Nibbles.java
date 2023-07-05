import java.util.*;
class Nibbles{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int nib=obj.nextInt();
            if(nib%4==0)
                System.out.println("Good");
            else
                System.out.println("Not Good");
        }
    }
}
