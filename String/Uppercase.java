package String;
import java.util.Scanner;
//for a string uppercase every first character
public class Uppercase {
    public static String UppercaseChange(String str){
        int l=str.length();
        StringBuilder out=new StringBuilder("");
        out.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<l;i++){
            if(str.charAt(i)== ' ' && i<l-1){
                out.append(str.charAt(i));
                out.append(Character.toUpperCase(str.charAt(++i)));

            }
            else {
                out.append(str.charAt(i));
            }
        }
        String out1=out.toString();
        return out1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        System.out.println(UppercaseChange(input));
    }
}
