package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 6244368661807858777L;

    String name;
    String mail;
    int roll;
    Student(String name,String mail,int roll){
        this.name=name;
        this.mail=mail;
        this.roll=roll;
    }
    void Display(){
        System.out.println("Hi! my name is "+name);
    }
}
