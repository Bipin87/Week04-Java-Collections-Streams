package com.capgemini.queue_interface.reverse_a_queue;

import java.util.LinkedList;
import java.util.Queue;

import static com.capgemini.queue_interface.reverse_a_queue.ReverseQueue.reverseQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}
