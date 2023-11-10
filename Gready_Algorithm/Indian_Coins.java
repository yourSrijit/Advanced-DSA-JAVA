package Gready_Algorithm;
//We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 20001.
//        Find min no. of coins/notes to make change for a value V.
//        V = 121


import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coins {
    public static int minCoinRequired(int coins[],int val){
        int total=0;
        Arrays.sort(coins);
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=val){
                while (coins[i]<=val){
                    total++;
                    val-=coins[i];
                }
            }
        }
    return total;
    }
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int val=124;
        int ans=minCoinRequired(coins,val);
        System.out.println(ans);

    }
}
