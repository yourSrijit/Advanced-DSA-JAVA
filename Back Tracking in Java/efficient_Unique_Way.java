package BackTracking;

public class efficient_Unique_Way {
    public static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static int countUmiqueWays(int n,int m){
        int num=factorial(n-1+m-1);
        int dem=factorial(n-1)*factorial(m-1);
        return num/dem;
    }
    public static void main(String[] args) {
        int row=5;
        int col=7;
        int res=countUmiqueWays( row, col);
        System.out.println("To ways can reach "+res);
    }
}
