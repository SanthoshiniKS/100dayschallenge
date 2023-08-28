class Solution {
    public int longestConsecutive(int[] nums) {
    int c=1,max=0;
	   if(nums.length==1)
	       return 1;
	   Arrays.sort(nums);
		 HashSet<Integer> set=new HashSet<>();
		 for(int i=0;i<nums.length;i++)
		 {
			 set.add(nums[i]);
		 }
		 if(set.size()==1) return 1;
	   for(int i=0;i<nums.length-1;i++)
	   {
	       if(nums[i+1]-nums[i]==1)
	               c++;
	       else if(nums[i+1]-nums[i]==0)
	              continue;
	       else
	          c=1;
	       max=Math.max(max,c);
	   }
	   return max;
    }
}
