package File_Handeling;
import java.io.File;
import java.io.IOException;
public class _2_GetFileInfo {
    public static void main(String[] args) {
          File f =new File("Sample2.txt");
        try{

            f.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        if(f.exists()){
            System.out.println("File exits");
            System.out.println("Name of the file is "+f.getName());
            System.out.println("is the file readable "+f.canRead());
            System.out.println("is the file writable "+f.canWrite());
            System.out.println("Absolute path of teh file is "+f.getAbsolutePath());
            System.out.println("The size of the file in bytes is: " + f.length());
        }
        else {
            System.out.println("File is not exist");
        }

    }
}
