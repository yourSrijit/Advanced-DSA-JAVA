package Heap_in_Java;

import java.util.PriorityQueue;

public class Kth_Weakest_Soldier {
    static class  Row implements Comparable<Row>{
        int soldier;
        int idx;
        public Row(int soldier,int idx){
            this.soldier =soldier;
            this.idx =idx;
        }
        public int compareTo(Row r1) {
            if (this.soldier == r1.soldier){
                return this.idx -r1.idx;
            }
            else {
                return this.soldier -r1.soldier;
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Row> pq =new PriorityQueue<>();
        int soldiers[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        for(int i=0;i< soldiers.length;i++){
            int count=0;
            for(int j=0;j<soldiers[0].length;j++){
                count+=soldiers[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }

    }
}
