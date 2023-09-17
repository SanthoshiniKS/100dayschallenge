class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
          return new int[] {-1,-1};
        int first=-1,last=-1;
        for(int i=nums.length-1;i>=0;i--)
        {
          if(nums[i]==target)
          {
            last=i;
            break;
          }
        }
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==target)
          {
            first=i;
            break;
          }
        }
        return new int[]{first,last};
    }
}
