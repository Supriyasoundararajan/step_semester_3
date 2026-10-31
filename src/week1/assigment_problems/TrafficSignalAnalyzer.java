package week1.assigment_problems;

import java.util.Scanner;

public class TrafficSignalAnalyzer {

    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0) {
            System.out.println("No Signal Data");
            return;
        }

        int count = 1;
        int maxCount = 1;
        char currentColor = signalLog.charAt(0);
        char maxColor = currentColor;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + maxColor
                + "' repeated " + maxCount + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine().toUpperCase();

        findLongestStreak(signalLog);

        sc.close();
    }
}