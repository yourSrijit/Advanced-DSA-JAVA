package Gready_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_2D {
    public static int findMaxActivity(int[][]activity,int l){
        Arrays.sort(activity, Comparator.comparingDouble(o->o[2]));
        int maxAct=1;
        int lastEnd=activity[0][2];
        for(int i=1;i<l;i++){
            if(activity[i][1]>=lastEnd) {
                maxAct++;
                lastEnd=activity[i][2];
            }
        }
        return maxAct;
    }
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int []end={2,4,6,7,9,9};
        int [][] activity=new int[start.length][3]; // index - start - end
        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        System.out.println(findMaxActivity(activity,start.length));

    }
}
