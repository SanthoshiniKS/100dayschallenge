class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1,index=nums.length;
        while (low<=high) {
            int mid=(low+high)/2;
            if (nums[mid]>=target){
                index=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return index;
    }
}
