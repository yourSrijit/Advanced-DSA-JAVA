package BackTracking;

public class FindSubset {

    public static void Findesubset(String str,String ans,int i){
//        Basecase
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //Yes
        Findesubset(str,ans+str.charAt(i),i+1);
//        No
        Findesubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";

        Findesubset(str," ",0);

    }
}

