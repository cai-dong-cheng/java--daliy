package com.homework.day07;

import java.io.*;


public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件File对象，注意需要显式抛出异常(IOException是编译时异常)
        //可以用try catch捕获，也可以在方法签名处使用 throws 抛出
        File file = new File("D:\\111.txt");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(file);

        //准备和文件大小一致的字节数组
        byte[] bytes = new byte[(int) file.length()];
        //通过字节输入流将文件读入数组
        is.read(bytes);
        //准备输出文件对象
        File outputFile = new File("D:\\222.txt");
        //准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        os.write(bytes);
        is.close();
        os.close();

    }
}