class Solution {
    void printTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}