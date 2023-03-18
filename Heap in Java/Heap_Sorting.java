package Heap_in_Java;

public class Heap_Sorting {

    public static void heapify(int arr[],int i,int size){
        int maxIdx =i;
        int left = 2*i+1;
        int right =2*i+2;
        if(left <size && arr[maxIdx]<arr[left]){
            maxIdx =left;
        }
        if(right <size && arr[maxIdx]<arr[right]){
            maxIdx =right;
        }
        if(maxIdx != i){
            //swap
            int tem =arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx] =tem;
            heapify(arr,maxIdx ,size);
        }
    }
    public static void heapSort(int arr[]){
        //  step-1 build maxHeap
        int n =arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // step-2 push the largest element at the end of the arr
         for(int i=n-1;i>0;i--){
             int tem =arr[0];
             arr[0] =arr[i];
             arr[i] =tem;
             heapify(arr,0,i);
         }
         display(arr);

    }
    public static void display(int arr[]){
        for(int x:arr){
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,9,2,6,3};
        heapSort(arr);
    }
}
