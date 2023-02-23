package String;
import java.util.Scanner;

public class Largest_String {
    public static void findLargest(String str[]){
        String largest =str[0];
//        StringBuilder largest=new StringBuilder(str[0]);
        for(int i=0;i<str.length;
            i++){
            if(largest.compareToIgnoreCase(str[i])<0){
              largest=str[i];
            }
        }
        System.out.println("Largest string is "+largest);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a[]=new String[4];
        System.out.println("Enter 4 string");
        for(int i=0;i<4;i++){
            a[i]=sc.nextLine();
        }
        findLargest(a);
    }
}
