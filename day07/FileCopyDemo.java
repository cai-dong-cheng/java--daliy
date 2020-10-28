package com.homework.day07;

import java.io.*;

/**
 * @author CDC
 */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Users/ASUS/Desktop/Logo.png");
        InputStream is = new FileInputStream(inputFile);
        byte[] b = new byte[(int) inputFile.length()];
        is.read(b);
        File outputFile = new File("C:/Users/ASUS/Desktop/Logo11.png");
        OutputStream os =new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
