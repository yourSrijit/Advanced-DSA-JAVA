package Trie_In_Java;

public class Longest_word_with_all_prefixes {
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
    public static boolean trieSearch(String key){
        Node cur=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(cur.child[idx]==null){
                return false;
            }
            if(i==key.length()-1 && cur.child[idx].endWord==false){
                return false;
            }
            cur=cur.child[idx];
        }
        return true;
    }
    public static String longPrefix="";
    public static void LongestWordprefix(Node root,StringBuilder temp){
        if(root==null){
            return ;
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null && root.child[i].endWord==true) {
                temp.append((char) (i + 'a'));

                if (temp.length() > longPrefix.length()) {
                    longPrefix = temp.toString();
                }
                LongestWordprefix(root.child[i], temp);
                    temp.deleteCharAt(temp.length() - 1);

            }
        }
    }
    public static void main(String[] args) {
        String word[]={"a","ap","app","banana","appl","apply","apple"};
        StringBuilder temp=new StringBuilder("");
        for(int i=0;i<word.length;i++){
            trieInsertion(word[i]);
        }
        LongestWordprefix(root,temp);
        System.out.println(longPrefix);

    }
}
