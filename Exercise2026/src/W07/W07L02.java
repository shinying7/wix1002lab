package W07;

public class W07L02 {
    // Print n copies of character c
    public static void multiPrint(int n, char c) {
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }

    // Display triangle
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            multiPrint(i, '*');
            System.out.println();
        }
    }

    // Display diamond
    public static void diamond(int n) {

        // Upper half
        for (int i = 1; i <= n; i++) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Triangle:");
        triangle(5);

        System.out.println();

        System.out.println("Diamond:");
        diamond(5);
    }
}
