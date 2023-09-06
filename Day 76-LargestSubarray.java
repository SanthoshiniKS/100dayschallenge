class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0,res=0;
        for(int i=0;i<n;i++){
            c=c+arr[i];
            if(c==0)
                res=i+1;
            if(!map.containsKey(c))
                map.put(c,i);
            else
                res=Math.max(res,i-map.get(c));
        }
        return res;
    }
}
