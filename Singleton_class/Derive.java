package Singleton_class;

public class Derive {
    Derive(){

    }

    public static void main(String[] args) {
    SingleTon obj =SingleTon.getInstance();
    SingleTon obj1 =SingleTon.getInstance();
    SingleTon obj2 =SingleTon.getInstance();
//        Three object are same objects
    }
}
