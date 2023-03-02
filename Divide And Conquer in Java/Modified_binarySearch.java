package DivideAndConquer;

import java.util.Scanner;

public class Modified_binarySearch {
    public static int modifiedBinary(int a[],int tar,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=e+(s-e)/2;
        if(a[mid]==tar){
            return mid;
        }
        //two case left & and right
        if(a[s]<=a[mid]){
            if(a[s]<=tar && tar <=a[mid]){
                return modifiedBinary(a,tar,s,mid-1);
            }
            else {
                return modifiedBinary(a,tar,mid+1,e);
            }
        }
        else {
            if(a[mid]<=tar && tar <=a[e]){
                return modifiedBinary(a,tar,mid+1,e);
            }
            else {
                return modifiedBinary(a,tar,s,mid-1);
            }
            }
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sorted array divided with pivot");
//        {4,5,6,7,0,1,2,3}
        int arr[]=new int[8];
        for(int i=0;i<8;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int t=sc.nextInt();
        System.out.println("The "+t+" is at index no "+modifiedBinary(arr,t,0,arr.length-1));
    }
}
