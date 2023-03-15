package TreeinJava;

import java.util.ArrayList;

public class Lowest_common_Ancestor {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root ,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data ==n){
            return true;
        }

        if(getPath(root.left,n,path) || getPath(root.right,n,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lcm(Node root,int n1,int n2){
        ArrayList<Node> path1 =new ArrayList<>();
        ArrayList<Node> path2 =new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //last common ancestor
        int i=0;
        for(;i<= path1.size() && i<=path2.size() ;i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        Node lcm =path1.get(i-1);
        return lcm;
    }

    public static void main(String[] args) {
         /*        1
                 /  \
                2    3
               / \  / \
             4    5 6  7
         */

        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int k1=4;
        int k2=5;
        // 2 will be the output as 2 is the lowest common ancestor of 4 and 5

        System.out.println("So the last common ancestor is "+lcm(root,k1,k2).data);

    }
}
