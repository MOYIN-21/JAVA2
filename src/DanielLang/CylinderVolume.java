package DanielLang;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %f%nThe volume is %f%n", area, volume);
    }
}
