class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        char[][] map=new char[n][2];
        for(int i=0;i<n;i++){
            map[i][0]=s.charAt(i);
            map[i][1]=t.charAt(i);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(map[i][0]==map[j][0] && map[i][1]!=map[j][1]){
                    return false;
                }
                if(map[i][1]==map[j][1] && map[i][0]!=map[j][0]){
                    return false;
                }
            }
        }
        return true;
    }
}
