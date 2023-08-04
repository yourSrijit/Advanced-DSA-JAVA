package Collection.ArrayList;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;

public class _2_ContainerwithMostWater {
    public static int findMaxewater(ArrayList<Integer> hight){
        int left=0;
        int right =hight.size()-1;
        int max=0;
        while(left<right){
            int ht= Math.min(hight.get(left),hight.get(right));
            int wd=right-left;
            int area=ht*wd;
            max=Math.max(max,area);

            if(hight.get(left) < hight.get(right)){
                left++;
            }
            else if(hight.get(left) > hight.get(right)){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return max;
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

        System.out.println("Maximum water wll be "+findMaxewater(hight));
    }
}
