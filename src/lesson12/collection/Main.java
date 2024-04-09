package lesson12.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue<Integer> tasks = new PriorityQueue<>();
//        tasks.add(5);
//        tasks.add(1);
//        tasks.add(9);
//        tasks.add(2);
//        tasks.add(3);
//        tasks.add(3);
////
////        System.out.println(tasks);
////        while (!tasks.isEmpty()){
////            System.out.println(tasks.poll());
////        }
////        System.out.println(tasks);
////
//        System.out.println(tasks.peek());
//        System.out.println(tasks.element());
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
//        priorityQueue.add("Александр");
//        priorityQueue.add("Игорь");
//        priorityQueue.add("Андрей");
//        System.out.println(priorityQueue);
//
//        while (!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.remove());
//        }
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int k = 1;
        int largest = findLargest(nums, k);
        System.out.println(k + " самый большой элемент: " + largest);
        k = 2;
        int largest2 = findLargest(nums, k);
        System.out.println(k + " самый большой элемент: " + largest2);
    }

    public static int findLargest(int[] num, int n){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int m:num) {
            minHeap.add(m);
            if (minHeap.size()>n){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
