class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        for(i=0;i<nums.length;i++)
            set.add(nums[i]);
        for(i=0;i<nums.length;i++)
        {
            if(!(set.contains(i)))
                return i;
        }
        if(!set.contains(i))
              return i;
        return 0;
    }
}
