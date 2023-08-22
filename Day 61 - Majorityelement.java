class Solution {
    public int majorityElement(int[] nums) {
        int c=0,max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
               set.add(nums[i]);
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    c++;
            }
            if(c>nums.length/2){
                 max=nums[i];
                 break;
            }
        }
        return max;
    }
}
