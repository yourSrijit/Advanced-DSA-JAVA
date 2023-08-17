package Comparable_Comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1  {
    static class laptop implements Comparable<laptop>{
        String name;
        int price;
        int star;
        laptop(String name,int price,int star){
            this.name=name;
            this.price=price;
            this.star=star;
        }
        public int compareTo(laptop t1){
            return this.price-t1.price;
        }
    }

    public static void main(String[] args) {
        List<Comparable1.laptop> list=new ArrayList<Comparable1.laptop>();
        list.add(new laptop("hp",20000,4));
        list.add(new laptop("Dell",50000,4));
        list.add(new laptop("Samsung",70000,3));
        list.add(new laptop("Appel",90000,5));
        Collections.sort(list);
        for(laptop l1:list){
            System.out.println(l1.name+" : "+l1.price+" : "+l1.star);
        }
    }
}
