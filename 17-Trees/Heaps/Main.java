package Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(12);
        heap.insert(45);
        heap.insert(7);
        heap.insert(89);
        heap.insert(23);
        heap.insert(56);
        heap.insert(78);
        heap.insert(3);
        heap.insert(67);

        /*            3
        *          /    \
        *         /      \
        *       7         23
        *     /   \      /   \
        *   12     89   45    56
        *  /   \
        * 78    34
        *      /
        *     67
        */    

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}
