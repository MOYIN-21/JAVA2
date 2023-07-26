package DanielLang;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate: ");
        int balance = scanner.nextInt();
        double interestRate = scanner.nextDouble();

        double interest =  balance * (interestRate/1200);
        System.out.printf("The interest is %.5f%n",interest);
    }
}
