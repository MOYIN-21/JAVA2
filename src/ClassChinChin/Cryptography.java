package ClassChinChin;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer");
        int input = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();
        int input4 = scan.nextInt();

        int var = (input + 7) % 10;
        int var2 = (input2 + 7) % 10;
        int var3 = (input3 + 7) % 10;
        int var4 = (input4 + 7) % 10;

        System.out.print(var);
        System.out.print(var2);
        System.out.print(var3);
        System.out.print(var4);

        System.out.println("**************************");

        System.out.print(var3);
        System.out.print(var4);
        System.out.print(var);
        System.out.print(var2);
    }
}
