package W06;

import java.util.Scanner;

public class W06L01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        int highest = 0;
        int lowest = 100;
        int sum = 0;

        // Generate random scores
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int)(Math.random() * 101);
        }

        // Display scores
        System.out.println("Student scores:");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
        }

        // Find highest, lowest and total
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            sum += scores[i];
        }

        double average = (double) sum / n;

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);

        input.close();
    }
}
