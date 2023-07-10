package Dynamic_Programming;

public class Target_sum {
    public static boolean isSum(int arr[],int tar){
         int n=arr.length;
        boolean dp[][]=new boolean[arr.length+1][tar+1];
        // i =item and j =target sum
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<tar+1;j++){
                int v=arr[i-1];
                //include
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }

                //exclude
            }
        }

        return dp[n][tar];
    }
    public static void main(String[] args) {
        int num[]={4,2,7,1,3};
        int targetSum=10;
       boolean ans=isSum(num,targetSum);
        System.out.println(ans);
    }
}
