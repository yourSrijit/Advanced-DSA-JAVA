public class Find_Permutation {
    public static void findPermutation(String input,String ans){
        //Base case
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        // Recursion  time complexity -> O(n*n!)
        for(int i=0;i<input.length();i++){
            char cur=input.charAt(i);
            String Newinput=input.substring(0,i)+input.substring(i+1);
            findPermutation(Newinput,ans+cur);
        }
    }
    public static void main(String[] args) {
        String input="abc"; //total permutation will be 3! =6
        findPermutation(input,"");
    }
}

//    abc
//    acb
//    bac
//    bca
//    cab
//    cba