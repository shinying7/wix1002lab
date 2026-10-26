package W04;

import java.util.Scanner;

public class W04L06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter the coordinates of the point (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distanceSquared = x * x + y * y;
        double radiusSquared = radius * radius;

        if (distanceSquared < radiusSquared) {
            System.out.println("The point is inside the circle.");
        } else if (distanceSquared > radiusSquared) {
            System.out.println("The point is outside the circle.");
        } else {
            System.out.println("The point is on the circle.");
        }

        input.close();
    }
}
