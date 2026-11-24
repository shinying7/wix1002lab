package W07;

public class W07L06 { 
    // Check whether a number is prime
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Reverse a number
    public static int reverse(int num) {

        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    // Check whether a number is a palindromic prime
    public static boolean isPalindromicPrime(int num) {

        return isPrime(num) && reverse(num) == num;
    }

    // Check whether a number is an emirp
    public static boolean isEmirp(int num) {

        int reversed = reverse(num);

        return isPrime(num) && isPrime(reversed) && reversed != num;
    }

    public static void main(String[] args) {

        int count = 0;
        int num = 2;

        System.out.println("First 20 Palindromic Primes:");

        while (count < 20) {

            if (isPalindromicPrime(num)) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println();

        count = 0;
        num = 2;

        System.out.println("\nFirst 20 Emirps:");

        while (count < 20) {

            if (isEmirp(num)) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println();
    }
}
