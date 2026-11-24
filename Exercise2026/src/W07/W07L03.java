package W07;

public class W07L03 {
    public static void reverseArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            numbers[i] = reverse;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1234, 567, 89, 123, 4567, 987, 321, 654, 120, 45};

        reverseArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
