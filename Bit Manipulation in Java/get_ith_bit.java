package BitManipulation;

public class get_ith_bit {
    public static void getIthNode(int n,int pos){
        int bitmask=1<<pos;
        if((n & bitmask)==0){
            System.out.println("The bit is 1");
        }
        else {
            System.out.println("The bit is 1");
        }

    }
    public static void main(String[] args) {
        getIthNode(10,3);

    }
}
