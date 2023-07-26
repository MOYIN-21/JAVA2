package DanielLang;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer,the input ends if it is 0:0: ");
        int result = input.nextInt();
        int positives= 0;
        int negatives= 0;
        //double total = 0;
        int programCounter = 1;
        while (programCounter < 0){
            if (result > 0){
                positives = positives+ 1;
            }
            else {
                negatives = negatives + 1;
            }
            programCounter = programCounter + 1;
        }
        System.out.printf("positives: %d%negatives: %d%n", positives, negatives);
        //double average = total/programCounter;
//
//
//

    }
}
