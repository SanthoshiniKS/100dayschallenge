class Solution {
    public int maxDepth(String s) {
        int depth=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(i);
            else if(s.charAt(i)==')')
            {
                if(depth<st.size())
                    depth=st.size();
                st.pop();
            }
        }
        return depth;
    }
}
