class Solution {
    private void swap(int[] nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    private void reverse(int[] nums,int left)
    {
        int right=nums.length-1;
        while(left<=right)
        {
            swap(nums,left,right);
            right--;
            left++;
        }
    }
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
        while(k>=0 && nums[k]>=nums[k+1])
        {
            k--;
        }
        if(k<0)
          reverse(nums,0);
        else{
            int i=nums.length-1;
            while(i>k && nums[i]<=nums[k])
                i--;
            swap(nums,i,k);
            reverse(nums,k+1);
        }
    }
}
