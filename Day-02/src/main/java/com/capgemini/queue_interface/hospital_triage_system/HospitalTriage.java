package com.capgemini.queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class HospitalTriage {
    private PriorityQueue<Patient> queue;

    public HospitalTriage() {
        queue = new PriorityQueue<>();
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public void processPatients() {
        System.out.println("Processing patients in order of severity:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
