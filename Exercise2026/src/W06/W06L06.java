package W06;

import java.util.Scanner;

public class W06L06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][0] = 1;

            for (int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
