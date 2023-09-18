class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int c=0,l=0,h=n-1;
        int first=-1,last=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==x)
            {
                first=mid;
                h=mid-1;
            }
            else if(arr[mid]>x)
              h=mid-1;
            else 
              l=mid+1;
        }
        l=0;h=n-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==x)
            {
                last=mid;
                l=mid+1;
            }
            else if(arr[mid]>x)
              h=mid-1;
            else 
              l=mid+1;
        }
        if(first!=-1 && last!=-1)
        c=last-first+1;
        
        return c;
    }
}
