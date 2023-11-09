package Sliding_Window.FixedSize;

import java.util.ArrayList;

public class First_Negative_Number_K {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0,j=0;
        int k=0,flag=0;
        ArrayList<Long> arr=new ArrayList<>();
        while(j<N){
              if(A[j]<0 && flag==0){
                  arr.add(A[j]);
                  flag=1;
              }
              if(j-i+1<K){
                  j++;
              }
              else if(j-i+1==K){
                  i++;
                  j++;
                  k++;
                  flag=0;
              }
        }
        long[] res=new long[arr.size()];
        i=0;
        for(long l:arr){
            res[i]=l;
            i++;
        }
      return res;
    }
    public static void main(String[] args) {

    }
}
