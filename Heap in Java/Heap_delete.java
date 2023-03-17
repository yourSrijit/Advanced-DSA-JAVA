package Heap_in_Java;

import java.util.ArrayList;

public class Heap_delete {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void insertion(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;
            int x = arr.size();
            if (left < x && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }
            if (right < x && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }
            if (minidx != i) {
                int tem = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, tem);
                heapify(minidx);
            }
        }

        public int deletion() {
            int data = arr.get(0);
            // step 1 - swap the first and last elements
            int x = arr.size();
            int temp = arr.get(0);
            arr.set(0, arr.get(x - 1));
            arr.set(x - 1, temp);

            // step 2 - delete the last element
            arr.remove(x - 1);

            // step 3 - call heapify
            heapify(0);

            return data;
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap ob = new Heap();
        ob.insertion(10);
        ob.insertion(1);
        ob.insertion(9);
        ob.insertion(4);
        ob.insertion(20);
        ob.insertion(7);
        ob.insertion(6);
        while (!ob.isEmpty()) {
            System.out.print(ob.peek() + " ");
            ob.deletion();
        }
    }
}
