package Collection.ArrayList;

import java.util.ArrayList;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//        Return the maximum amount of water a container can store.
//
//        Notice that you may not slant the container.
public class _1_Container_with_mostWater {
    public static int findMaxewater(ArrayList<Integer> num){
        int max=Integer.MIN_VALUE;
        int maxWater=0;
        for(int i=0;i< num.size();i++){
            for (int j=i+1;j< num.size();j++){
                int hight=Math.min(num.get(i),num.get(j));
                int width=j-i;
                max=hight*width;
                maxWater=Math.max(max,maxWater);
            }
    }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> hight=new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);hight.add(8);
        hight.add(3);hight.add(7);

        System.out.println("Max water iwll be "+findMaxewater(hight));
    }
}
