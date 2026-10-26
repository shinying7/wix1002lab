package W04;

import java.util.Scanner;

public class W04L01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter the operand: ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            } else {
                System.out.println("Cannot calculate remainder with zero.");
            }
        } else {
            System.out.println("Invalid operand.");
        }

        input.close();
    }
}
