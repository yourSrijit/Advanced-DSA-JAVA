package Dynamic_Programming;

public class Longest_Common_Subsequence_Memoization {
    public static int lcs(String s1,String s2,int n,int m,int dp[][]){
        if(n==0 ||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=lcs(s1,s2,n-1,m-1,dp)+1;
        }
        else {
            dp[n][m]=Math.max(lcs(s1,s2,n,m-1,dp) ,lcs(s1,s2,n-1,m,dp));
        }
      return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        int ans=lcs(str1,str2,n,m,dp);
        System.out.println(ans);
    }
}
