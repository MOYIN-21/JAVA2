package ClassChinChin;

import java.util.Scanner;

public class OnlyValid {
    public static void main(String[] args) {
        int score = 1;
        int total = 0;
        while (score <= 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter score: ");

            int even = scanner.nextInt();
            if (even > 0 && even < 100) {
                total += even;
        }
            score++;
    }
        System.out.println(total);
    }
}
