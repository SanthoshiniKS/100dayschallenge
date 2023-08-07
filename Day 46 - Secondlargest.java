class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int max=arr[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]<max)
                return arr[i];
        }
        return -1;
    }
}
