package W06;

import java.util.Scanner;

public class W06L05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20];

        // Generate 20 random integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 101);
        }

        System.out.println("A list of 20 random integers within 0 to 100:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Sort array in descending order
        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] < numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }

        System.out.println("\nArray in descending order:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Get user input
        System.out.print("\nEnter a number to search: ");
        int search = input.nextInt();

        // Linear Search
        int count = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            count++;

            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " found");
        } else {
            System.out.println(search + " not found");
        }

        System.out.println("Linear Search - " + count + " loop(s)");

        // Binary Search
        int low = 0;
        int high = numbers.length - 1;

        count = 0;
        found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            count++;

            if (numbers[mid] == search) {
                found = true;
                break;
            }
            else if (numbers[mid] > search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println(search + " found");
        } else {
            System.out.println(search + " not found");
        }

        System.out.println("Binary Search - " + count + " loop(s)");

        input.close();
    }
}
