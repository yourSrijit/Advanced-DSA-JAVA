package TreeinJava;

public class Min_distance_Nodes {
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
    public static Node lca(Node root,int n1,int n2){
        if( root==null || root.data ==n1 || root.data ==n2 )
        {
            return root;
        }
        Node lcaLeft =lca(root.left,n1,n2);
        Node lcaRight =lca(root.right,n1,n2);
        if(lcaLeft ==null){
            return lcaRight;
        }
        if(lcaRight == null){
            return lcaLeft;
        }
        return root;
    }
    public static int minDisLcaToNode(Node root ,int n){
        if(root ==null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDis =minDisLcaToNode(root.left,n);
        int rightDis =minDisLcaToNode(root.right,n);
        if(leftDis ==-1 && rightDis ==-1){
            return -1;
        }
        else if(leftDis ==-1){
            return rightDis +1;
        }
        else{
            return leftDis+1;
        }
    }

    public static int mindisTwoNode(Node root ,int n1,int n2){
        Node lca =lca(root,n1,n2);
        int leftDis = minDisLcaToNode(lca,n1);
        int rightDis =minDisLcaToNode(lca ,n2);
        return (leftDis +rightDis );
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
        int n1=4;
        int n2=3;

        System.out.println("So the distance between "+n1+" and "+n2 +" is "+mindisTwoNode(root,n1,n2));
    }
}
