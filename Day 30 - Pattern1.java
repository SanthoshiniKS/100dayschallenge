class Solution {
    void printTriangle(int n) {
        String str="";
        for(int i=0;i<n;i++)
        {
            str+=(char)(65+i);
            System.out.println(str);
        }
    }
}

/*
n=5

A
AB
ABC
ABCD
ABCDE
*/