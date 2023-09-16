class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
       Arrays.sort(arr);
       int c=-1,f=-1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]<=x)
               c=arr[i];
           if(arr[i]>=x){
               f=arr[i];
               break;
           }
       }
        return new Pair(c,f);
    }
}

