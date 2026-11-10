package W06;

public class W06L04 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int[][] rotated = new int[3][3];

        // Rotate 90 degrees clockwise
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotated[j][2 - i] = matrix[i][j];
            }
        }

        // Display the rotated matrix
        System.out.println("After rotates 90 degrees clockwise:");

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
