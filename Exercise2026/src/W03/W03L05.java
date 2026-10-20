/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

import java.util.Random;
/**
 *
 * @author leeshinying
 */
public class W03L05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(10001);
        System.out.println("Generated number: " + number);

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of all digits: " + sum);
    }
}
