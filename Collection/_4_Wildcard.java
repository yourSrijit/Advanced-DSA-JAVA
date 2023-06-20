package Collection;

import java.util.ArrayList;

public class _4_Wildcard {
   public static class Student{
        public void Print(){
            System.out.println("I am Student");
        }
    }
    static class engStu extends Student{
        public void Print(){
            System.out.println("I am engStu");
        }
    }
    static class ManStu extends Student{
        public void Print(){
            System.out.println("I am ManStud");
        }
    }
    static class  Test{
       public static void PrintStudent(ArrayList<? extends Student> ob){
           for(Student e: ob){
               e.Print();
           }
       }
    }
    public static void main(String[] args) {
//        Student ob =new Student();
//        engStu ob1 =new engStu();
//        ob=ob1;
////        ob1=ob; Not possible
//        ob.Print();
   ArrayList<engStu> o1 =new ArrayList<>();
   o1.add(new engStu());
   o1.add(new engStu());
   ArrayList<ManStu> o2 =new ArrayList<>();
   o2.add(new ManStu());
        Test.PrintStudent(o1);
        Test.PrintStudent(o2);
   }
}
