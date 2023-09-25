package Gready_Algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Activity_Selection {
    public static int findMaxActivity(int []start, int []end){
        int l=start.length;
        int maxAct=0;
        List<Integer> list=new ArrayList<>();
        // First activity
        maxAct=1;
        list.add(0);
        int lastEnd=end[0];
        for(int i=1;i<l;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                list.add(i);
                lastEnd=end[i];
            }

        }
        System.out.println(list);
        return maxAct;
    }
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int []end={2,4,6,7,9,9};
       int result= findMaxActivity(start,end);
        System.out.println("Total "+result+" no activity can happen");
    }
}
