package com.luv2code.samplePractice.Heap;

public class HeapMain {
    public static void main(String ar[]) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.sort();

        heap.printHeap();

        heap.delete(0);
        heap.printHeap();
        System.out.println(heap.peek());

    }
}
