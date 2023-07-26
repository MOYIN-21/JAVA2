package DanielLang;

import java.util.Scanner;

public class AlgebraQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double v = (b * b) - (4 * a * c);
        double r1 = (-b + Math.pow(v, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(v, 0.5)) / (2 * a);

        if (v > 0)
            System.out.printf("The equation has two roots %f%n%.5f%n", r1, r2);
        else
            if (v == 0)
                System.out.printf("The equation has one root %.0f%n", r1);
            else
                if (v < 0)
                    System.out.print("The equation has no real roots");
    }



}
