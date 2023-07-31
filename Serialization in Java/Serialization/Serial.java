package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try{
            //Creating object of class
            Student ob=new Student("Srijit","Srijit@gmail",1560);
            //Write data to file
            FileOutputStream ofs=new FileOutputStream("Serialization.txt");
            ObjectOutputStream oos =new ObjectOutputStream(ofs);

            oos.writeObject(ob);
            ofs.close();
            oos.close();
            System.out.println("Serialization Successfully");

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
