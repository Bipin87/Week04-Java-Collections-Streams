package com.capgemini.queue_interface.hospital_triage_system;

public class Main {
    public static void main(String[] args) {
        HospitalTriage hospitalTriage = new HospitalTriage();

        // Adding patients
        hospitalTriage.addPatient("Abhinav", 3);
        hospitalTriage.addPatient("BK sahu", 5);
        hospitalTriage.addPatient("Aman", 2);

        // Processing patients
        hospitalTriage.processPatients();
    }
}
