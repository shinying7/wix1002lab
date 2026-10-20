/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

import java.util.Scanner;
/**
 *
 * @author leeshinying
 */
public class W03L02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car price (P): ");
        double P = input.nextDouble();

        System.out.print("Enter down payment (D): ");
        double D = input.nextDouble();

        System.out.print("Enter interest rate in % (R): ");
        double R = input.nextDouble();

        System.out.print("Enter loan duration in years (Y): ");
        double Y = input.nextDouble();

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        System.out.printf("Monthly Payment: %.2f\n", M);

        input.close();
    }
}
