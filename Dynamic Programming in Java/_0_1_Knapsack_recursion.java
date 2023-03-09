package Dynamic_Programming;

public class _0_1_Knapsack_recursion {
    public static int findMaxProfit(int val[],int wt[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){   //Valid
            //Include
            int inc=val[n-1]+findMaxProfit(val,wt,W-wt[n-1],n-1);

            //Exclude
            int exc =findMaxProfit(val,wt,W,n-1);
            return Math.max(inc,exc);
        }
        else {
            //Invlaid
            return findMaxProfit(val,wt,W,n-1);
        }
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2, 5, 1, 3, 4};
        int cap=7;
        int n=5;
        System.out.println("So maximum profit is "+findMaxProfit(val,wt,cap,n));
    }
}
