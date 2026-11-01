package week2.assignment_problems;

import java.util.Scanner;

public class WordReversalEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]);
            result.append(reversed.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Encoded Sentence: " + result);
        sc.close();
    }
}
