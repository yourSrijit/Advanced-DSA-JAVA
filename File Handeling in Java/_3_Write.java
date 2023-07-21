package File_Handeling;
import java.io.FileWriter;
import java.io.IOException;

public class _3_Write {
    public static void main(String[] args) {
        try{
            FileWriter fw =new FileWriter("sample.txt");
            fw.write(" Srijit is a good boy .He is single 1:)");
            fw.close();
            System.out.println("Successfully Write");
        }
        catch (IOException e){
            System.out.println("An unexpected error occurs");
            e.printStackTrace();
        }
    }
}
