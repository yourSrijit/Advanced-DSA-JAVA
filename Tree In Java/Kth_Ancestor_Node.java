package TreeinJava;

public class Kth_Ancestor_Node {

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
    public static int KthAncestor(Node root,int n,int k){
        if(root ==null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDis=KthAncestor(root.left,n,k);
        int rightDis =KthAncestor(root.right,n,k);
        if(leftDis ==-1 && rightDis ==-1){
            return -1;
        }
        int max =Math.max(leftDis ,rightDis);
        if(max+1 ==k){
            System.out.println(root.data);
        }
            return max +1;
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
        int k2=2;

        System.out.print("so the 2nd ancestor of s is ");
        KthAncestor(root,k1,k2);
    }
}
