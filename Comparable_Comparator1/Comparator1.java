package Comparable_Comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    static class car {
        String name;
        int price;

        car(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

        public static void main(String[] args) {
            List<car> list=new ArrayList<>();
            Comparator1 comparator1 = new Comparator1();
            list.add(new car("Honda",52000));
            list.add(new car("Hero",51000));
            list.add(new car("BMW",40000));
            list.add(new car("Tesla",90000));
            Comparator<car> com=new Comparator<car>() {
                @Override
                public int compare(car o1, car o2) {
                    return o1.price-o2.price;
                }
        };
            Collections.sort(list, com); // Use the Comparator to sort the list

            for (car c : list) {
                System.out.println(c.name + " : " + c.price);
            }
    }
}
