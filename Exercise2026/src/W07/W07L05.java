package W07;

import java.util.Scanner;

public class W07L05 {

    public static boolean isCorrect(int num1, int num2, int answer) {
        return answer == num1 * num2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        while (true) {

            int num1 = (int)(Math.random() * 13);
            int num2 = (int)(Math.random() * 13);

            System.out.println("Enter negative number to quit.");

            System.out.print(num1 + " x " + num2 + " = ");
            int answer = input.nextInt();

            if (answer < 0) {
                break;
            }

            if (isCorrect(num1, num2, answer)) {
                score++;
            }
        }

        System.out.println("Your Score is " + score);

        input.close();
    }
}
