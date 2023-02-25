package BitManipulation;

public class set_Ith_bit {
    public static void setIthbit(int n,int pos){
        int bitmask= 1<<pos;
        System.out.println("After set the ith bit the number is");
        System.out.println(n |bitmask);
    }
    public static void main(String[] args) {
        setIthbit(10,2);
    }
}
