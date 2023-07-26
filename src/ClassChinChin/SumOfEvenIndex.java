package ClassChinChin;

import java.util.Scanner;

public class SumOfEvenIndex {
    public static void main(String[] args) {
        int score = 1;
        int total = 0;
        while(score <= 10){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter scores: ");

            int result = scanner.nextInt();
            if(score % 2 != 0){
                total += result;
            }
            score++;
        }
        System.out.print("Total is" + ' ' + total);




    }
}
