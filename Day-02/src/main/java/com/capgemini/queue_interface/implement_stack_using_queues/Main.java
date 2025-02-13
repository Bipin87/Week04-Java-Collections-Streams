package com.capgemini.queue_interface.implement_stack_using_queues;

public class Main {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        // Adding data in stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Call method and display results
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
