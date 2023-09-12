class Solution
{
    static long inversionCount(long arr[], long N)
    {
        long c=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j] && i<j)
                {
                    c=c+1;   
                }
            }
        }
        return c;
    }
}
