package week2.class_problems;

import java.util.Scanner;

public class PhoneNumberMask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (phone.length() == 10 && phone.matches("[0-9]+")) {
            StringBuilder masked = new StringBuilder();

            masked.append("XXXXXX");
            masked.append(phone.substring(6));

            System.out.println("Masked Number: " + masked);
        } else {
            System.out.println("Invalid phone number");
        }

        sc.close();
    }
}
