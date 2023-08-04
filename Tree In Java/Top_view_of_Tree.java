package TreeinJava;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_view_of_Tree {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static class info{
        int hd;
        Node node;
        info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        int min=0,max=0;
        Queue<info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new info(root,0));
        q.add(null);
        while (!q.isEmpty()){
            info cur =q.remove();
            if(cur==null){
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                if (!map.containsKey(cur.hd)) {
                    map.put(cur.hd, cur.node);
                }
                if (cur.node.left != null) {
                    map.put(cur.hd - 1, cur.node.left);
                    min = Math.min(min, cur.hd - 1);

                }
                if (cur.node.right != null) {
                    map.put(cur.hd + 1, cur.node.right);
                    max = Math.max(max, cur.hd + 1);

                }
                for (int i = min; i <= max; i++) {
                    System.out.println(map.get(i).data + " ");
                }
            }
        }

    }
    public static void main(String[] args) {
           /*      1
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
        topView(root);

    }
}
