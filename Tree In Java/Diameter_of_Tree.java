package TreeinJava;
//The diameter/width of a tree is defined as the number of nodes on the longest path between two end nodes.
// The diagram below shows two trees each with a diameter of nine, the leaves that form the ends of the
// longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).


import java.io.DataInput;
import java.security.PublicKey;

public class Diameter_of_Tree {

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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int Diameter(Node root){
        if(root ==null){
            return 0;
        }
        int leftdia =Diameter(root.left);
        int leftheight =height(root.left);
        int rightdia = Diameter(root.right);
        int rightheight =height(root.right);

        int selfdia= leftheight +rightheight +1;
        return Math.max(selfdia ,Math.max(leftdia,rightdia));
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

        System.out.println("So the height of the tree is "+height(root));
        System.out.println("So the max diameter of the tree is "+Diameter(root));
    }
}

//O(n^2)
