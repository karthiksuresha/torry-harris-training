package com.torryharris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int code;
    private String desc;
    private int qty;
    private double price;
    private double total;

    public Product(int code, String desc, int qty, double price, double total) {
        this.code = code;
        this.desc = desc;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // displayFormat
    public static void displayFormat() {
        System.out.print(
                "\nName\t\tDescription\t\tQuantity\t\tPrice\t\tTotal\n");
    }

    // display
    public void display() {
        System.out.format("%-5d\t %10s\t\t\t %3d\t\t %10.2f\t %10.2f\n",
                code, desc, qty, price, total);
    }
}
public class customerTotal {
    static String ch;
    static double grandTotal = 0;

    static String check() {
        System.out.println("Enter 'y' to add item : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextLine();

        return ch;
    }

    static double calcTotal() {
        if (grandTotal > 10000) {
            grandTotal = grandTotal - (grandTotal * 10) / 100;
        } else if (grandTotal < 1000) {
            System.out.println("Pay by card and get a 2.5% on surcharge");
            grandTotal = grandTotal - (grandTotal * 2.5) / 100;
        }
        return grandTotal;
    }

    public static void main(String[] args) {

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        List<Product> product = new ArrayList<Product>();

        char choice;
        double total;
        do {
            // read input values
            System.out.println("Enter product details,");
            System.out.print("Code: ");
            int code = scan.nextInt();
            System.out.print("Description: ");
            String desc = scan.next();
            System.out.print("Quality: ");
            int qty = scan.nextInt();
            System.out.print("Price : ");
            double price = scan.nextDouble();

            total = qty * price;
            grandTotal += total;

            // create Product class object and add it to the list
            product.add( new Product(
                    code, desc, qty, price, total) );

            // ask for continue?
            System.out.print("Want to add more item? (y or n): ");
            choice = scan.next().charAt(0);

            // read remaining characters, don't store (no use)
            scan.nextLine();
        } while (choice == 'y' || choice == 'Y');

        // display all product with its properties
        Product.displayFormat();
        for (Product p : product) {
            p.display();
        }
        calcTotal();
        // overall price
        System.out.println("\nTotal Price = " + grandTotal);

        // close Scanner
        scan.close();
    }
}
