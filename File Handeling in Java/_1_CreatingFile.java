package File_Handeling;
import  java.io.File;
import  java.io.IOException;
public class _1_CreatingFile {
    public static void main(String[] args) {
        File f1 =new File("Sample.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("The file named "+f1.getName() +"Created successfully");
            }
            else {
                System.out.println("That file already exits");
            }
        }
        catch (IOException e){
            System.out.println("An interrupt happen");
            e.printStackTrace();
        }


    }
}
