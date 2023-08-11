class Solution {
    void leftRotate(int[] arr, int n, int d) {
        int j=0;
        int[] arr1=Arrays.copyOfRange(arr,d,n);  
        int[] arr2=Arrays.copyOfRange(arr,0,d);  
        for(int i=0;i<arr1.length;i++)
        {
               arr[i]=arr1[i];
        }
        for(int i=arr1.length;i<n;i++)
        {
            arr[i]=arr2[j];
            j++;
        }
    }
}
