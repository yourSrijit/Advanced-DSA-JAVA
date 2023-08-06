package Collection.Map_Interface;

import java.util.ArrayList;

public class ByScratch_Implementation {
    static class User{
        int roll;
        String Name;
        User(int roll,String Name){
            this.roll=roll;
            this.Name=Name;
        }
    }
    static class UserData{
        static ArrayList<User> db;
       public UserData(){
           db=new ArrayList<User>();
        }
        public static String get(int i){
            for(User elm:db){
                if(elm.roll==i){
                    return elm.Name;
                }
            }
            return null;
        }
        public static void set(int roll,String name){
           for(User elm:db){
               if(elm.roll==roll){
                   elm.Name=name;
                   return;
               }
           }
           db.add(new User(roll,name));
        }
    }
    public static void main(String[] args) {
        UserData userData = new UserData();

        // Set user data
        UserData.set(1, "Srijit");
        UserData.set(2, "Kamalika");
        UserData.set(1, "Bishtu");
        UserData.set(4, "Rumi");
        UserData.set(1, "Srijit");

        // Get user data
        System.out.println("User with roll 1: " + UserData.get(1));
        System.out.println("User with roll 2: " + UserData.get(2));
        System.out.println("User with roll 3: " + UserData.get(3));
        System.out.println("User with roll 4: " + UserData.get(4));

    }
}
//        User with roll 1: Srijit
//        User with roll 2: Kamalika
//        User with roll 3: null
//        User with roll 4: Rumi