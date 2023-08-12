class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int c=0,k=0,j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
                k++;
            }
        }
        for(int i=k;i<n;i++)
        {
            arr[i]=0;
        }
    }
}
