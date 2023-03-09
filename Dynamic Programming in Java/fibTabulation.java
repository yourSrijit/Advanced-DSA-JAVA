package Dynamic_Programming;

public class fibTabulation {
    public static int fibonacchi_Tabulation(int num){
        int dp[]=new int[num+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=num;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[num];
    }

    public static void main(String[] args) {
        System.out.println("Fibbonacchi  is "+fibonacchi_Tabulation(5));
    }
}




