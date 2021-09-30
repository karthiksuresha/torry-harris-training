package com.Day9.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Enter number: ");
        Scanner scan1 = new Scanner(System.in);
        n = scan1.nextInt();

        String s;
        System.out.println("Enter the Name: ");
        Scanner scan2 = new Scanner(System.in);
        s = scan2.nextLine();

        FileWriter writer = new FileWriter("name.txt");
        for (int i = 0; i < n; i++) {
            writer.write(s+"\n");
            writer.flush();
        }
    }
}
