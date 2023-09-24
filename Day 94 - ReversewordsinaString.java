class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split(" +");
        int i=0;
        String reverse="";
        for(i=arr.length-1;i>0;i--)
        {
              reverse+=arr[i]+" ";
        }
        reverse+=arr[i];
        return reverse;
    }
}
