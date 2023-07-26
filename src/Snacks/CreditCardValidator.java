package Snacks;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello,kindly enter your 16 card details to verify: ");
        long output = input.nextLong();
        if (output > 16){
            System.out.println("invalid");
        }
    }
}
