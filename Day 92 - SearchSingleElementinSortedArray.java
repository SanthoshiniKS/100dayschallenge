class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
        int low=0,high=nums.length - 1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]!=nums[mid+1]){
                high=mid;
            } else {
                low=mid+2;
            }
        }
        return nums[low];
    }
}
