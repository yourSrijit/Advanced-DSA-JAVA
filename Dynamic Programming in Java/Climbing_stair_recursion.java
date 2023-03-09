package Dynamic_Programming;
import java.util.Arrays;
public class Climbing_stair_recursion {

    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n=5;
//        int ways[]=new int [n+1];
//        Arrays.fill(ways,-1);
        System.out.println("So the number of ways to reach "+n+" th stairs is "+countWays(n));
    }
}
//O(2^n)