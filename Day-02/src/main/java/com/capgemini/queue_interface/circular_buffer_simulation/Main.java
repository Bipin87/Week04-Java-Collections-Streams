package com.capgemini.queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {
        BufferCircular buffer = new BufferCircular(3);

        // Insert the value in buffer and display result
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();

        buffer.insert(4);
        buffer.display();

        buffer.insert(5);
        buffer.display();
    }
}
