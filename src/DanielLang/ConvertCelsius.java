package DanielLang;

import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        double celsius = scanner.nextDouble();

        double Fahrenheit = (9.0/5) * celsius + 32;
        System.out.printf("celsius is %.1f%n",Fahrenheit);
    }
}
