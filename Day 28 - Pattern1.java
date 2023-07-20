class Solution {
    void printTriangle(int n) {
        String str="";
        for(int i=0;i<n;i++)
        {
            str+="* ";
            System.out.println(str);
        }
        for(int i=n-1;i>0;i--)
        {
            System.out.println(str.substring(0,i*2));
        }
    }
}


/*
n=5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/