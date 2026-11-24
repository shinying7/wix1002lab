package W07;

public class W07L01 {
    public static int triangularNumber(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        for (int n = 1; n <= 20; n++) {
            System.out.println(triangularNumber(n));
        }

    }
}
