package com.Day9.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) throws IOException {

        File input = new File("input.txt");
        FileReader reader = new FileReader(input);

        char []array = new char[(int)input.length()];
        reader.read(array);
        String data = new String(array);
        System.out.println(data);

        reader.close();

        data = "This is a contents of output file using FileWriter object";
        FileWriter writer =new FileWriter("output1.txt");
        writer.write(data);
        writer.flush();

        writer.close();
    }
}
