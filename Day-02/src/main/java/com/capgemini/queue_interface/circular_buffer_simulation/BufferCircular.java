package com.capgemini.queue_interface.circular_buffer_simulation;

public class BufferCircular {
    // Attributes
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    // Parameterized constructor
    public BufferCircular(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Method to insert an element into the buffer
    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity; // Overwrite oldest element
        }
    }

    // Method to display the buffer
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
