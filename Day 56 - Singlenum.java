class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int c=0,num=0;
        Arrays.sort(nums);
        if(nums[0]!=nums[1])
            return nums[0];
        if (nums[nums.length-1]!=nums[nums.length-2]){ 
            return nums[nums.length-1];
        }
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
            {
                return nums[i];
            }
        }
        return num;
    }
}
