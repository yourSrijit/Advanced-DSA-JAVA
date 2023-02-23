package String;

import java.util.Scanner;

//aaabbbbcdd ->a3b4cd2
public class String_Compression {
    public static String toCompression(String str){
        StringBuilder out =new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
          count++;
          i++;
        }
        out.append(str.charAt(i));
        if(count>1){
          out.append(count);
        }
        }
        return out.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        System.out.println(toCompression(input));
    }
}
