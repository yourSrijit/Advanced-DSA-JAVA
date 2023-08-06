package Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Order {
    public static void getFrequency(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Integer"+"\t"+"Frequency");
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+"\t\t"+e.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={5,10,20,5,10,2,2,2,4,9,10,9,4,7,8};
        getFrequency(arr);
    }
}
