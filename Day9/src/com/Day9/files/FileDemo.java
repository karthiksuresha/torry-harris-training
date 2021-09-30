package com.Day9.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.txt");
        System.out.println("File contents are:");
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("output.txt");
        String str="This is an output file.\nThis contains data output.";
        char []array = str.toCharArray();
        for(char c:array)
        {
            fos.write((int)c);
        }
        fos.close();
        System.out.println("\nContents are written to the file: output.txt");

        FileInputStream fis1 = new FileInputStream("output.txt");
        System.out.println("File contents are:");
        int ch1;
        while((ch1=fis1.read())!=-1)
        {
            System.out.print((char)ch1);
        }
        fis.close();
    }
}
