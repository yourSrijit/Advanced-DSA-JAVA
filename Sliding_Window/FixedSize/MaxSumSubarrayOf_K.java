package Sliding_Window.FixedSize;

import java.util.ArrayList;
import java.util.Arrays;

//Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
public class MaxSumSubarrayOf_K {
    public static long maximumSumSubarray(int K, ArrayList<Integer> arr, int N){
        int i=0,j=0;
        long sum=0;
        long max = Long.MIN_VALUE;
        while(j<N){
            sum+=arr.get(j);
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                max=Math.max(sum,max);
                sum=sum-arr.get(i);
                i++;
                j++;
            }
        }

        return max;
    }
    public static void main(String[] args){
    }
}
