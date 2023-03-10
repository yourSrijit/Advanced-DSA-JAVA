package Dynamic_Programming;

public class _0_1_Knapsack_memoizition {
    public static int findMaxProfit(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){   //Valid
            //Include
            int inc=val[n-1]+findMaxProfit(val,wt,W-wt[n-1],n-1,dp);

            //Exclude
            int exc =findMaxProfit(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(inc,exc);
            return dp[n][W];
        }
        else {
            //Invlaid
            dp[n][W]= findMaxProfit(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }
    public static void main(String[] args) {
        int n=5;
        int val[]={15,14,10,45,30};
        int wt[]={2, 5, 1, 3, 4};
        int cap=7;
        int dp[][]=new int[val.length+1][cap+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        System.out.println("So maximum profit is "+findMaxProfit(val,wt,cap,n,dp));
    }
}
