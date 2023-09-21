class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int l=0,h=n-1,ans=Integer.MAX_VALUE,index=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[l]<=arr[h]) 
            {
                if (arr[l]<ans) {
                    index=l;
                    ans=arr[l];
                }
                break;
            }
            if(arr[l]<=arr[mid]) {
                if(arr[l]<ans) {
                    index=l;
                    ans=arr[l];
                }
                l=mid+1;
            } 
            else {
                if(arr[mid]<ans) {
                    index=mid;
                    ans=arr[mid];
                }
                h=mid-1;
            }
        }
        return index;
    }
}
