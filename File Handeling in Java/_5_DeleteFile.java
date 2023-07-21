package File_Handeling;
import java.io.File;
import java.io.IOException;
public class _5_DeleteFile {
    public static void main(String[] args) {
        File f1=new File("Test.txt");
        try{
            f1.createNewFile();
            System.out.println("Successfully Created");
        }
        catch (Exception e){
            System.out.println("Unexpected Error occurs");
            e.printStackTrace();
        }
        if(f1.delete()){
            System.out.println("Successfully Deleted");
        }
        else {
            System.out.println("Unexpected Error occurs");
        }
    }
}
