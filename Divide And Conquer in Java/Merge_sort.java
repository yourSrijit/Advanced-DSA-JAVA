package DivideAndConquer;

import java.util.Scanner;


//Time complexity ->O(nlog(n))
//Space Complexity->O(n)

public class Merge_sort {
    public static void mergeSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si +(ei-si)/2;
        mergeSort(a,si,mid); //Left
        mergeSort(a,mid+1,ei); //Right
        merge(a,si,mid,ei);      //Right
    }
    public static void merge(int a[],int si,int mid,int ei){
        int temp[]=new int[a.length];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else {
                temp[k++]=a[j++];
            }
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }
        while (j<=ei){
            temp[k++]=a[j++];
        }
        for(i=si;i<=ei;i++){
            a[i]=temp[i-si];
        }
    }
    public static void printAll(int a[]){
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printAll(a);
        mergeSort(a,0, a.length-1);
        System.out.print("\nSorted Array: ");
        printAll(a);

    }
}
