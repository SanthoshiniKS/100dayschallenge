class Solution {
    static String armstrongNumber(int n){
        int s=0,num=n;
        int rem=0;
        while(n>0)
        {
           rem=n%10;
           s+=Math.pow(rem,3);
           n=n/10;
        }
        if(num!=s)
            return "No";
        else
           return "Yes";
    }
}