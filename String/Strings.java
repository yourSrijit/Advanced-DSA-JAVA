package String;

public class Strings {
    public static void main(String[] args) {
        String a="Srijit";
        String b="Srijit";
        String c=new String("Srijit"); //Interning
        if(a==b){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }

        if(a==c){ //Thi will return not equal bez of Interning
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }
        if (a.equals(c)) {
            System.out.println("Dhin cahkkkkk cahk dhin  hak");
        }

    }
}
