package HashingInJava;

import java.util.LinkedList;
import java.util.List;

public class HashMapCode{

    static class HashMap<K, V>{ //Generic
        public class Node{
            K key;
            V value;
            public Node(K key ,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bucket[];
//        @SuppressWarnings("unchecked");
        public HashMap(){
            this.N=4; //bucket.length
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i] =new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N;  // 0 to 3
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll =bucket[bi];
           int di=0;
           for(int i=0;i<ll.size();i++){
               Node node=ll.get(i);
               if(node.key == key){
                   return di;
               }
               di++;
           }
           return -1;
        }
        private void reHash(){
            LinkedList<Node> oldBuck[] =bucket;
            bucket =new LinkedList[2*N];
            N=2*N;
            for (int i=0;i<bucket.length;i++){
                bucket[i] =new LinkedList<>();
            }

            for(int i=0;i<bucket.length;i++){
                LinkedList<Node> ll =oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.remove();
                    put(node.key,node.value);
                }

            }
        }
        private void put(K key,V value){
            int bi=hashFunction(key); // 0 to 3
            int di =searchInLL(key,bi);
            if(di!=-1){
                Node node =bucket[bi].get(di);
                node.value =value;
            }
            else {
                bucket[bi].add(new Node(key,value));
                    n++;
            }
            double lamda =n/N;
            if(lamda >2.0){
                reHash();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String ,Integer> hm =new HashMap<>();
        hm.put("Srijit",156);
        hm.put("Kamalika",155);
        hm.put("Subhra",154);
    }
}
