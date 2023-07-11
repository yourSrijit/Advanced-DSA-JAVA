package MultiThread;

import javax.swing.*;

public class Sleep_Method {
    public static class A extends Thread{
//        @override
        public void run(){
            String s=Thread.currentThread().getName();
            try{
                for(int i=0;i<3;i++) {
                    System.out.println(s);
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException i){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        A t1 =new A();
        A t2 =new A();
        A t3 =new A();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

