package com.capgemini.java_streams.piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadCommunication extends Thread {
    private PipedOutputStream pos;
    private PipedInputStream pis;
    public ThreadCommunication(PipedOutputStream pos,PipedInputStream pis) {
        this.pos = pos;
        this.pis=pis;
    }
    public void runWriter() {
        try {
            String message = "Hello write the text in thread";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("IOException occur writing thread: " + e.getMessage());
        }
    }
    public void runReader() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("IOException occur reading thread: " + e.getMessage());
        }
    }

}
