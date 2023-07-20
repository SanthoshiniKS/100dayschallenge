class Solution {
    void printTriangle(int n) {
        String str="1";
        for(int i=1;i<=n;i++)
        {
            System.out.println(str);
            if(i%2==0)
                str='1'+" "+str;
            else
               str='0'+" "+str;
        }
        
    }
}

/*
n=5

1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/