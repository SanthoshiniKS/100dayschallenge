class Solution {
    public int maxSubArray(int[] nums) {
        int c=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(c<0)
               c=nums[i];
            else
              c+=nums[i];
            max=Math.max(max,c);
        }
        return max;
    }
}
