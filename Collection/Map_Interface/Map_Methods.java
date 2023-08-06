package Collection.Map_Interface;

import java.util.*;

public class Map_Methods {
    public static void main(String[] args) {
        Map<Integer,String> db =new TreeMap<Integer,String>();
        System.out.println("Enter the number of student");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the roll and Name of student no "+(i+1));
            int roll=new Scanner(System.in).nextInt();
            String name=new Scanner(System.in).nextLine();
            db.put(roll,name);
        }


//        Traversal
        System.out.println("So the Roll and Name of all students are");
        System.out.println("Roll"+"\t"+"Name");
        for(Map.Entry<Integer,String> e:db.entrySet()){
            System.out.println(e.getKey()+"\t\t"+e.getValue());
        }

        //isEmpty()
        if(db.isEmpty()){
            System.out.println("The database is empty");
        }

        //remove()
//        db.remove() -> Return the remove value

        if(db.containsKey(2)){
            System.out.println("Roll no 2 is present");
        }
        if(db.containsValue("Kamalika")){
            System.out.println("She is with me always"); // 😘
        }

        db.replace(3,"Bishtu");

        System.out.println("Number of student in db is "+db.size());

        System.out.println("Time to clear my storage byyyyyy all");
        db.clear();
        if(db.isEmpty()){
            System.out.println("Upps sorry i'm now in rest in peace");
        }
    }

}

//    Enter the number of student
//        3
//        Enter the roll and Name of student no 1
//        1
//        Srijit
//        Enter the roll and Name of student no 2
//        2
//        Kamalika
//        Enter the roll and Name of student no 3
//        3
//        Subhra
//        So the Roll and Name of all students are
//        Roll	Name
//        1		Srijit
//        2		Kamalika
//        3		Subhra
//        Roll no 2 is present
//        She is with me always
//        Number of student in db is 3
//        Time to clear my storage byyyyyy all
//        Upps sorry i'm now in rest in peace
