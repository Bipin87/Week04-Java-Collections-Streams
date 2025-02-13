package com.capgemini.queue_interface.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue {
    // Attributes
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Non-parameterized constructor
    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        queue1.add(x);
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int topElement = queue1.remove();

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int topElement = queue1.peek();
        queue2.add(queue1.remove());

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

}
