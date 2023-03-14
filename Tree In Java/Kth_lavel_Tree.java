package TreeinJava;

public class Kth_lavel_Tree {
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
    public static void K_thLevel(Node root,int level,int n){
        if(root ==null){
            return;
        }
        if(level ==n){
            System.out.print(root.data+" ");
            return;
        }
        K_thLevel(root.left,level+1,n);
        K_thLevel(root.right,level+1,n);

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
        int n=2;
        K_thLevel(root,1,2);
    }
}


//O(n) ********