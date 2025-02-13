package com.capgemini.java_streams.buffered_streams_efficient_file_copy;

import java.io.*;

public class FileCopy {
    // Method to copy contents using unbuffered streams
    public void copyFileUnbuffered(String sourceFile, String destFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File source = new File(sourceFile);
            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(source);
            fos = new FileOutputStream(destFile);

            int byteData;
            long startTime = System.nanoTime();
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            long endTime = System.nanoTime();

            System.out.println("Unbuffered copy completed in: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }

    // Method to copy contents using buffered streams
    public void copyFileBuffered(String sourceFile, String destFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            File source = new File(sourceFile);
            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            bis = new BufferedInputStream(new FileInputStream(source));
            bos = new BufferedOutputStream(new FileOutputStream(destFile));

            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();

            System.out.println("Buffered copy completed in: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
