package ClassChinChin;

import java.util.Scanner;

public class SumOfEvenScores {
    public static void main(String[] args) {
        System.out.println();
        int score = 1;
        int total = 0;
        while(score <= 10){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter score: ");

            int even = scanner.nextInt();
            if(even % 2 == 0){
                total +=even;
            }
            score++;
        }
        System.out.println(total);
    }
}
