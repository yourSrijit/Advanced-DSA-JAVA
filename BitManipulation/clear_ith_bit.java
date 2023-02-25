package BitManipulation;

public class clear_ith_bit {
    public static void clearIthBit(int n,int pos){
        int bitmask=~(1<<pos);
        System.out.println("After clearing the number is "+ (n&bitmask));
    }
    public static void main(String[] args) {
        clearIthBit(10,1);
    }
}
