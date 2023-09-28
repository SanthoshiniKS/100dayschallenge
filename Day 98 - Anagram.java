class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())   
            return false;
        ArrayList<Character> a1=new ArrayList<>();
        ArrayList<Character> a2=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            a1.add(s.charAt(i));
            a2.add(t.charAt(i));
        }
        Collections.sort(a1);
        Collections.sort(a2);
        for(int i=0;i<a1.size();i++)
        {
            if(a1.get(i)!=a2.get(i))
                return false;
        }
        return true;
    }
}
