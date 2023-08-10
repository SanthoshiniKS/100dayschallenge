class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
             arr.add(nums[i]);
        for(int i=0;i<k;i++)
        {
            int temp=arr.remove(nums.length-1);
            arr.add(0,temp);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr.get(i);
        }
    }
}
