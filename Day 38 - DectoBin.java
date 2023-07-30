class Solution{
	void toBinary(int N) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(N>0)
        {
            arr.add(N%2);
            N=N/2;
        }
        for(int i=arr.size()-1;i>=0;i--)
        {
            System.out.print(arr.get(i));
        }
	}
}