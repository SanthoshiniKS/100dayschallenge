import java.util.*;
class DPoly {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=obj.nextInt();
            int arr[]=new int[n];
            int c=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=obj.nextInt();
                if(arr[j]!=0)
                   c=j;
            }
            System.out.println(c);
        }
    }
}
