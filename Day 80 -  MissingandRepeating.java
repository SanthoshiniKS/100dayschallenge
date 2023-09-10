class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] temp=new int[n]; 
        int repeatingNumber = -1;
        int missingNumber = -1;
        int a[]=new int[2];
        for (int i=0;i<n;i++) {
            temp[arr[i]-1]++;
            if(temp[arr[i]-1]>1) {
                a[0]=arr[i];
            }
        }
        for (int i=0;i<n;i++) {
            if (temp[i] == 0) {
                a[1]=i+1;
                break;
            }
        }
        return a;
    }
}
