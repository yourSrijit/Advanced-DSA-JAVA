package TreeinJava;

//1.Root
//2.Left subtree
//3.Right subtree


public class Traversing {
    static class Node{
        Node left;
        Node right;
         int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node buildTree(int Nodes[]){
        idx++;
        if(Nodes[idx]==-1){
            return null;
        }
        Node new_node=new Node(Nodes[idx]);
        new_node.left=buildTree(Nodes);
        new_node.right=buildTree(Nodes);
        return new_node;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
     int Nodes[]={5,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Traversing ob=new Traversing();
     Node root=ob.buildTree(Nodes);
     System.out.println("Root of the node is "+root.data);

        System.out.println("In Preorder the tree is ");
        preOrder(root);

        System.out.println("\nIn  Inorder the tree is ");
        inOrder(root);

        System.out.println("\nIn  Postorder the tree is ");
        postOrder(root);
    }
}

///  O(n)
