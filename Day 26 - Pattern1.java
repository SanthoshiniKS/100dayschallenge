class Solution {
    void printTriangle(int n) {
        // code here
        String a="1 ";
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            a+=(i+1)+" ";
        }
    }
}
