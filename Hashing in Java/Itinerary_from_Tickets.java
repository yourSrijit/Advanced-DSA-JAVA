package HashingInJava;

import java.util.HashMap;
import java.util.Map;

public class Itinerary_from_Tickets {
    public static void findTheStarting(HashMap<String,String> path){
        HashMap<String,String> reversePath=new HashMap<>();
        for(Map.Entry<String,String> e:path.entrySet()){
            reversePath.put(e.getValue(),e.getKey());
        }
        String start="";
        for(String key:path.keySet()){
            if(reversePath.containsKey(key)==false){
                start=key;
            }
        }
        while(path.containsKey(start)){
            System.out.print(start+" -> ");

            start=path.get(start);
        }
        System.out.print(start);
    }
    public static void main(String[] args) {
        HashMap<String,String> path=new HashMap<>();
        path.put("Chennai","Bengaluru");
        path.put("Delhi","Chennai");
        path.put("Kolkata","Delhi");
        path.put("Bengaluru","Darjiling");
        findTheStarting(path);

    }
}
