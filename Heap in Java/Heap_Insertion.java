package Heap_in_Java;

import java.util.ArrayList;

public class Heap_Insertion {
    static class heap{
        ArrayList<Integer> arr =new ArrayList<>();
        public void Insertion(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par =(x-1)/2;
            while (arr.get(x)<arr.get(par)){
                int temp =arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par =(x-1)/2;
            }

        }
    }
    public static void main(String[] args) {
        Heap_delete.Heap ob = new Heap_delete.Heap();
        ob.insertion(10);
        ob.insertion(1);
        ob.insertion(9);
        ob.insertion(4);
        ob.insertion(20);
        ob.insertion(7);
        ob.insertion(6);

    }
}
