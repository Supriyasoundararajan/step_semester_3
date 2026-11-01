package week2.assignment_problems;

import java.util.*;

public class WordFrequencyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().toLowerCase();

        text = text.replace(".", "")
                   .replace(",", "")
                   .replace("!", "")
                   .replace("?", "");

        String[] words = text.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!Arrays.asList(stopWords).contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Word Frequency Report:");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
