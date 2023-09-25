class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0)
                return "";
        Arrays.sort(strs);
        String pre=strs[0];
        String last=strs[strs.length-1];
        int c=0;
        while(c<pre.length())
        {
            if(pre.charAt(c)==last.charAt(c))
                c++;
            else
                break;
        }
        return c==0?"":pre.substring(0, c);
    }
}
