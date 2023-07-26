package DanielLang;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of water in kilogram: ");
        double m = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double Q = m * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.1f%n",Q);
    }
}
