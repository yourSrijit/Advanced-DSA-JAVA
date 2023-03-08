package TreeinJava;
//Given the root of two BST anf subRoot,return true if the subtree of root with the same
//structure and node values of subRoot and false otherwise
public class Subtree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root ==null && subRoot ==null){
            return true;
        }
        if(root ==null || subRoot ==null || (root.data != subRoot.data)){
            return false;
        }
        if(!isIdentical(root.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root ==null){
            return false;
        }
        if(root.data ==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftAns =isSubtree(root.left,subRoot);
        boolean rightAna =isSubtree(root.right,subRoot);
        return leftAns || rightAna ;
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

        /*
                2
               / \
              4   5
         */
        Node subroot=new Node(2);
        subroot.left=new Node(4);
//        subroot.right=new Node(5);  //->is a subtree
        subroot.right=new Node(51); //-->is not a subtree

        System.out.println("Is the 2nd tree is the subtree of the 1st tree "+isSubtree(root,subroot));
    }
}
