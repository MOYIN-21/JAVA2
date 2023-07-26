package ClassChinChin;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score1 = scan.nextInt();
        int score2 = scan.nextInt();
        int score3 = scan.nextInt();
        int score4 = scan.nextInt();
        int score5 = scan.nextInt();
        int score6 = scan.nextInt();
        int score7 = scan.nextInt();
        int score8 = scan.nextInt();
        int score9 = scan.nextInt();
        int score10 = scan.nextInt();

        int average = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 / 2;

        System.out.print("Average is" + ' ' + average);
    }
}
