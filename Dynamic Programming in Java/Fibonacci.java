package Dynamic_Programming;

public class Fibonacci {
    public static int fibonacci(int a[],int n){
        if(n<=1){
            return n;
        }
        if(a[n]!=0){
            return a[n];
        }
        a[n]=fibonacci(a,n-1)+ fibonacci(a,n-2);
        return a[n];
    }
    public static void main(String[] args) {
        int n=5;
        int a[]=new int[n+1];
        System.out.println("Sum of first "+(n+1)+" element in fibonacci series is "+fibonacci(a,n));
    }
}

// O(n)

//Memoization :
    // In computing, memoization or memoisation is an optimization technique used primarily to
    // speed up computer programs by storing the results of expensive function calls and returning the cached
    // result when the same inputs occur again.