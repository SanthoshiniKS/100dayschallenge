class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows<1) return res;
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        res.add(arr);
        for (int i=1;i<numRows;i++) {
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=res.get(i-1);
            for (int j=0;j<=i;j++) {
                int temp=(j>0?prev.get(j-1):0)+(j<i?prev.get(j):0);
                cur.add(temp);
            }
            res.add(cur);
        }
        return res;
    }
}
