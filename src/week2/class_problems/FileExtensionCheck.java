package week2.class_problems;

import java.util.Scanner;

public class FileExtensionCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int dot = fileName.lastIndexOf('.');

        if (dot != -1) {
            String extension = fileName.substring(dot + 1).toLowerCase();

            if (extension.equals("pdf") ||
                extension.equals("docx") ||
                extension.equals("zip")) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected");
            }
        } else {
            System.out.println("Rejected");
        }

        sc.close();
    }
}