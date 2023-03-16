package TreeinJava;

public class Lowest_common_Ancestor_2 {
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
    public static Node lcm(Node root,int n1,int n2){
        if( root==null || root.data ==n1 || root.data ==n2 )
        {
            return root;
        }
        Node lcmLeft =lcm(root.left,n1,n2);
        Node lcmRight =lcm(root.right,n1,n2);
        if(lcmLeft ==null){
            return lcmRight;
        }
        if(lcmRight == null){
            return lcmLeft;
        }
        return root;
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
        int k2=7;
        // 2 will be the output as 2 is the lowest common ancestor of 4 and 5

        System.out.println("So the last common ancestor is "+lcm(root,k1,k2).data);

    }
}
