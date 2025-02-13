package com.capgemini.java_streams.byte_stream_convert_image_to_byte_array;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/capgemini/java_streams/byte_stream_convert_image_to_byte_array/img.png";
        String outputPath = "src/main/java/com/capgemini/java_streams/byte_stream_convert_image_to_byte_array/transimg.png";

        ByteStream imageProcessing = new ByteStream(filePath, outputPath);
        try {
            byte[] imageBytes = imageProcessing.convertImageToByteArray();
            imageProcessing.writeByteArrayToImage(imageBytes);
            System.out.println("Image successfully converted to byte array and written back in image.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
