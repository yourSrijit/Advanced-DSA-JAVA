package Heap_in_Java;

import javax.swing.event.InternalFrameListener;
import java.util.PriorityQueue;

public class Connect_N_ropes {
    public static int findMinCostToConnect(int ropes[]){

        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++)
        {
            pq.add(ropes[i]);
        }
        int totMin=0;
        while (pq.size()>1){
            int min1 =pq.remove();
            int min2 =pq.remove();
            int tempCost=min1 +min2;
             totMin +=min1 +min2;
            pq.add(tempCost);
          }
        return totMin;
    }
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        int minCost=findMinCostToConnect(ropes);
        System.out.println("So the total cost to connect N ropes is "+minCost);

    }
}

// Given are N ropes of different lengths, the task is to connect these ropes into one rope with
// minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.