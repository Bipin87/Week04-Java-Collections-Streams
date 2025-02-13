package com.capgemini.java_streams.piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            ThreadCommunication communication = new ThreadCommunication(pos,pis);
            communication.runWriter();
            communication.runReader();
        } catch (IOException e) {
            System.out.println("IOException occur: " + e.getMessage());
        }

    }
}
