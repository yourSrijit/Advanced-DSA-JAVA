package Singleton_class;

public class SingleTon {
    public int x=10;

    private SingleTon(){

    }
    private static SingleTon obj =new SingleTon();
    public static SingleTon getInstance(){
        return obj;
    }
}
