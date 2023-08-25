package Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class print_Highest_Frequncies {

    public static void findHighFreq(int arr[],Map<Integer,Integer> ans){
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i], ans.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>m: ans.entrySet()){
            if(m.getValue()>1){
                System.out.print(m.getKey()+" ");
            }
        }

    }
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int arr[]={1,10,20,35,35,60,60,1,1,5,8,9,5,8,4,7,75,48,98,69,59,69};
        findHighFreq(arr,map);


    }
}
