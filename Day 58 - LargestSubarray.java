class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
             HashMap<Integer,Integer> map=new HashMap<>();
             int sum=0,max=0;
             for (int i=0;i<N;i++) 
             {
                  sum+=A[i];
                  if(sum==K)
                      max=i+1;
                  if(!map.containsKey(sum)) {
                      map.put(sum,i);
                  }
                  if(map.containsKey(sum-K)) 
                  {
                      if (max<(i-map.get(sum-K)))
                          max=i-map.get(sum-K);
                  }
             }
              
             return max; 
    }
}
