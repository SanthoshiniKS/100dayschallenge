class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList<Integer> a=new ArrayList<>();
         int i=l,j=m+1;
         while(i<=m && j<=r){
             if(arr[i]<=arr[j]){
                 a.add(arr[i]);
                 i++;
             }
             else{
                 a.add(arr[j]);
                 j++;
             }
         }
         while(i<=m){
             a.add(arr[i]);
             i++;
         }
         while(j<=r){
             a.add(arr[j]);
             j++;
         }
         for(int k=l;k<=r;k++){
             arr[k]=a.get(k-l);
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
         if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}
