package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try{
            FileInputStream fi =new FileInputStream("Serialization.txt");
            ObjectInputStream ois =new ObjectInputStream(fi);
           Student s= (Student)ois.readObject();
           s.Display();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception c){
            c.printStackTrace();
        }

    }
}
