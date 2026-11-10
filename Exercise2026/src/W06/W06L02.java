package W06;

public class W06L02 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate;

            do {
                numbers[i] = (int)(Math.random() * 21);

                duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (numbers[i] == numbers[j]) {
                        duplicate = true;
                        break;
                    }
                }

            } while (duplicate);
        }

        System.out.println("10 non-duplicate random integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
