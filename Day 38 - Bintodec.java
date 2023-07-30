class Solution {
    public int binary_to_decimal(String str) {
        int dec=0,base=1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='1'){
            dec+=base;
            }
            base=base*2;
        }
        return dec;
    }
}