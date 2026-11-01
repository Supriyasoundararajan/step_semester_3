package week2.assignment_problems;

import java.util.Scanner;

public class ProductInventoryParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product record: ");
        String record = sc.nextLine();

        String[] data = record.split(",");

        if (data.length == 3) {
            System.out.println("Product: " + data[0]);
            System.out.println("SKU: " + data[1]);
            System.out.println("Qty: " + data[2]);
        } else {
            System.out.println("Invalid Record");
        }

        sc.close();
    }
}
