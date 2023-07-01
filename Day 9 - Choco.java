import java.util.*;
class Choco {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=obj.nextInt();
            int x=obj.nextInt();
            int y=obj.nextInt();
            System.out.println((c-x)*y);
        }
    }
}￼
