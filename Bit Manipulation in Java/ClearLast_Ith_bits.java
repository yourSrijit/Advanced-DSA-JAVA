package BitManipulation;

public class ClearLast_Ith_bits {
    public static void clearLastIthbits(int n,int k){
        int bitMask=(~0)<<k;
        System.out.println("After clearing the number is "+(n &bitMask));
    }
    public static void main(String[] args) {
        clearLastIthbits(15,2);
    }
}
