package Gready_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Min_Absolute_Differance_Pair {
    public static int findMinAbs(int A[],int B[]){
        Arrays.sort(A);
        Arrays.sort(B);
        int res=0;
        for(int i=0;i<A.length;i++){
            res+=Math.abs(A[i]-B[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,6,4,7}; // 1 3 4 6 7
        int arr2[]={2,6,5,8,9};  //2 5 6 8 9      1+2+2+2+2
        System.out.println("Min absolute differance is "+findMinAbs(arr1,arr2));
    }
}
