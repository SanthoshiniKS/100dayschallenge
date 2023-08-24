class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=Integer.MAX_VALUE;
        System.out.println(min);
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            if(prices[i]-min>max)
                    max=prices[i]-min;          
        }
        return max;
    }
}
