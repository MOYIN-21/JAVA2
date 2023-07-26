package DanielLang;

import java.util.Scanner;

public class OperatorUsage {
    public static void main(String[] args) {

        Scanner operator = new Scanner(System.in);

        System.out.println("Enter any integer: ");
        int num = operator.nextInt();

        boolean A = num % 5 == 0 && num % 6 == 0;
        boolean B = num % 5 == 0 || num % 6 == 0;
        boolean C = num % 5 == 0 ^ num % 6 == 0;

        System.out.println("Is " + num +" divisible by 5 and 6? "+ A );
        System.out.println("Is " + num + " divisible by 5 or 6? "+ B );
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + C);
    }
}
