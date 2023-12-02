package Dynamic_Programming;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int l=s.length();
        int count=0;
        boolean dp[][]=new boolean[l][l];
        for(int g=0;g<l;g++){
            for(int i=0, j=g;j<l;j++,i++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }
                else {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j]==true){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
