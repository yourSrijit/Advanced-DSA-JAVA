public class Main {
	class A extends Thread{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("I am Srijit");
			}
		}
	}
  public static void main(String[] args) {
	  
    Main.A ob =new Main.A();
	  ob.start();
	  for(int i=0;i<10;i++){
				System.out.println("Is a good boy");
			}
  }
}