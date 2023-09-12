class Solution {
    public int reversePairs(int[] nums) {
        int c=0;
        for (int i=0;i<nums.length;i++)
            for (int j=i+1;j<nums.length;j++)
                if ((long)nums[i]>(long)2*nums[j])    
                    c++;
        return c;
    }
}
