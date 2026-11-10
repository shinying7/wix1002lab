package W06;

import java.util.Scanner;

public class W06L03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = input.nextInt();

        int[][] hours = new int[n][7];

        // Generate working hours
        for (int i = 0; i < hours.length; i++) {

            for (int j = 0; j < hours[i].length; j++) {

                hours[i][j] = (int)(Math.random() * 8) + 1;
            }
        }

        // Display working hours and total hours
        for (int i = 0; i < hours.length; i++) {

            int total = 0;

            System.out.print("Employee " + (i + 1) + ": ");

            for (int j = 0; j < hours[i].length; j++) {

                System.out.print(hours[i][j] + " ");

                total += hours[i][j];
            }

            System.out.println("\nTotal hours: " + total);
        }
        input.close();
    }
}
