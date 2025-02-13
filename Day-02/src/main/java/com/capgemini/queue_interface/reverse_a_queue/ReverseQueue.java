package com.capgemini.queue_interface.reverse_a_queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    // Method to reverse a queue using only queue operations
    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        // Push all elements into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pop from the stack and enqueue back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}
