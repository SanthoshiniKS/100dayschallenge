class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
                System.out.print("*");
            for(int k=0;k<2*(i-1);k++)
                System.out.print(" ");
            for(int j=n;j>=i;j--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=0;k<2*(n-i);k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
