class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
         ArrayList<Integer> a=new ArrayList<>();
         int max=arr[n-1];
         a.add(max);
         for(int i=n-2;i>=0;i--)
         {
             if(arr[i]>=max)
             {
                 max=arr[i];
                 a.add(0,arr[i]);
             }
         }
         return a;
    }
}
