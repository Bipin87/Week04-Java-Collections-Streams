package com.capgemini.java_streams.data_streams_store_and_retrieve_primitive_data;

public class Main {
    public static void main(String[] args) {
        String filePath ="src/main/java/com/capgemini/java_streams/data_streams_store_and_retrieve_primitive_data/studentDetails.txt";
        StudentDetailsHandling detailsHandling = new StudentDetailsHandling(filePath);

        detailsHandling.writeStudentData(043, "Bipin", 7.90);
        detailsHandling.writeStudentData(032,"Abhinav",8.49);
        detailsHandling.writeStudentData(211,"Aman",8.23);
        detailsHandling.readStudentDetails();

    }
}
