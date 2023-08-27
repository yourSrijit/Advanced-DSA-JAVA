package Trie_In_Java;

public class WordBreak {
    static class Node{
        Node[] child;
        boolean endWord;
        Node(){
            child=new Node[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            endWord=false;
        }
    }
    static Node root=new Node();
    public static void trieInsertion(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(cur.child[idx]==null){
                cur.child[idx]=new Node();
            }
            if(i==word.length()-1){
                cur.child[idx].endWord=true;
            }
            cur=cur.child[idx];
        }
    }
    public static boolean trieSearch(String key) {
        Node cur = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && cur.child[idx].endWord == false) {
                return false;
            }
            cur = cur.child[idx];
        }
        return true;
    }
    public static boolean wordBreak(String str){
        if(str.length()==0){
            return true;
        }
        for(int i=1;i<=str.length();i++){
            String first=str.substring(0,i);
            String second=str.substring(i);
            if(trieSearch(first)&& wordBreak(second)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"i","like","samsung","mobile"};
        String str="ilikesamsungmobile";
        for(int i=0;i<word.length;i++){
            trieInsertion(word[i]);
        }
        System.out.println(wordBreak(str));

    }
}
