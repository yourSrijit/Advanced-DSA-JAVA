package BitManipulation;

import java.util.Scanner;

public class odd_even {
    public static void findOddEven(int n){
        int bitmask=1;
        if((n&bitmask) == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        findOddEven(n);
    }
}
