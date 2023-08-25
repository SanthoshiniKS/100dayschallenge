class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int arr[]=new int[nums.length];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                pos.add(nums[i]);
            else
               neg.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=pos.get(k);
                k++;
            }
            else{
                arr[i]=neg.get(j);
                j++;
            }
        }
        return arr;
    }
}
