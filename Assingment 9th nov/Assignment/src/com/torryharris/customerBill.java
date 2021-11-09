package com.torryharris;
import java.util.Scanner;

public class customerBill {
    static String ch;
    static double grandTotal = 0;

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
        Scanner scan = new Scanner(System.in);
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

            System.out.print("Want to add more item? (y or n): ");
            choice = scan.next().charAt(0);
            scan.nextLine();
        } while (choice == 'y' || choice == 'Y');
        calcTotal();
        System.out.println("\nTotal Price = " + grandTotal);
        scan.close();
    }
}
