class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) 
            return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==goal.charAt(0)) {
                if (s.substring(i).equals(goal.substring(0,s.length()-i))) {
                    if (s.substring(0,i).equals(goal.substring(s.length()- i)))
                        return true;
                }
            }
        }
        return false;
    }
}
