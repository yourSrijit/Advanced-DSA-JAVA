package String;

import java.util.Scanner;


public class PalindromCheck {
    public static boolean checkPalindrome(String a){
        int l=a.length()/2;
        int n=a.length();
        for(int i=0;i<l;i++){
          if(a.charAt(i)!=a.charAt(n-i-1)){
              return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        boolean a=checkPalindrome(input);
        if(a){
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }
    }
}
