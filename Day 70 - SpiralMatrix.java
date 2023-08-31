class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int k=0,l=0,lr=matrix.length-1,lc=matrix[0].length-1;
        while(k<=lr && l<=lc)
        {
            for(int i=l;i<=lc;i++)
                arr.add(matrix[k][i]);
            k++;
            for(int i=k;i<=lr;i++)
                arr.add(matrix[i][lc]);
            lc--;
            if(k<=lr)
            {
                for(int i=lc;i>=l;i--)
                    arr.add(matrix[lr][i]);
                lr--;
            }
            if(l<=lc)
            {
                for(int i=lr;i>=k;i--)
                {
                    arr.add(matrix[i][l]);
                    
                }
                l++;
            }
        }
        return arr;
    }
}
