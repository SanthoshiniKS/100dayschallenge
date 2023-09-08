class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n=nums.length,xor=0; 
        long c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i=0;i<n;i++) {
            xor^=nums[i];
            if(map.containsKey(xor))
                c+=map.get(xor);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return c;
    }
}
