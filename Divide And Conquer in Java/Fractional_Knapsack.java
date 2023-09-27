package Gready_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static double findMaxProfit(int []val,int []wt,int W){
        double [][]ratio=new double[val.length][2];
        int n=val.length;
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o ->o[1]));
        int cap=W;
        double maxPro=0;
        for(int i=n-1;i>=0;i--){
            int idx=(int)ratio[i][0];
           if(cap>=wt[idx]){
                maxPro+=val[idx];
                cap-=wt[idx];
            }
            else {
                maxPro+=ratio[i][1]*cap;
                cap=0;
                break;
            }
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int []wt={10,20,30};
        int []val={60,100,120};
        int W=50;
        System.out.println("So the max profit is "+findMaxProfit(val,wt,W));
    }

}
