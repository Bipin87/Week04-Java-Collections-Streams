package com.capgemini.java_streams.byte_stream_convert_image_to_byte_array;

import java.io.*;
import java.nio.file.Files;

public class ByteStream {
    private String inputFilePath;
    private String outputFilePath;

    public ByteStream(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    public byte[] convertImageToByteArray() throws IOException {
        File file = new File(inputFilePath);
        return Files.readAllBytes(file.toPath());
    }

    public void writeByteArrayToImage(byte[] imageBytes) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(imageBytes);
        }
    }

}
