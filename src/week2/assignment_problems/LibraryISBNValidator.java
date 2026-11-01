package week2.assignment_problems;

import java.util.Scanner;

public class LibraryISBNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String isbn = sc.nextLine().trim();

        if (isbn.length() != 13) {
            System.out.println("Invalid ISBN - Wrong Length");
        } else {
            isbn = isbn.substring(0, 3).toUpperCase() + isbn.substring(3);

            boolean valid = true;

            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(isbn.charAt(i))) {
                    valid = false;
                }
            }

            for (int i = 3; i < 13; i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    valid = false;
                }
            }

            if (valid) {
                String year = isbn.substring(3, 7);
                String catalog = isbn.substring(7, 13);

                StringBuilder result = new StringBuilder();
                result.append("[").append(isbn.substring(0, 3));
                result.append("] YEAR: ").append(year);
                result.append(" | CATALOG: ").append(catalog);

                System.out.println(result);
            } else {
                System.out.println("Invalid ISBN - Incorrect Format");
            }
        }

        sc.close();
    }
}
