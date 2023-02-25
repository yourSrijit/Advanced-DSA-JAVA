package BitManipulation;

public class clear_RangeofBits {
    public static void clearRange(int n,int i,int k){
        int a =(~0)<<(k+1);
        int b=(1<<i)-1;
        int bitMask =a | b;
        System.out.println("After change the result is "+(bitMask & n));
    }
    public static void main(String[] args) {
    clearRange(10,2,4);
    }
}
