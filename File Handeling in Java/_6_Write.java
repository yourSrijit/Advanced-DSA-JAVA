package File_Handeling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class _6_Write {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("Sample.txt");
            System.out.println("Enter a string");
            String str=new Scanner(System.in).nextLine();
            f.write(str);
            System.out.println("Writing successfully");
            f.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
