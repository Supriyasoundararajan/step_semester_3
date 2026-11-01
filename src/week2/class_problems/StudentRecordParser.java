package week2.class_problems;

import java.util.Scanner;

public class StudentRecordParser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record (Name,RollNumber,Department): ");
        String input = sc.nextLine();

        String[] data = input.split(",");

        if (data.length == 3) {
            System.out.println("Student Name: " + data[0]);
            System.out.println("Roll Number: " + data[1]);
            System.out.println("Department: " + data[2]);
        } else {
            System.out.println("Invalid student record");
        }

        sc.close();
    }
}