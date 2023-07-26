package PlayingGround;

import java.util.Arrays;

import static Snacks.CheckElement.CheckElement;


public class MfFunction {
    public static void main(String[] args) {
        int[] vert = {2, 4, 5, 6};
        int[] joy = reverseNumber(vert);
        System.out.println(Arrays.toString(joy));

        int[] fila = {2, 3, 2, 3};
        int weed = totalNumber(fila);
        System.out.println(weed);

            int[] numbers = {457, 984, 324, 694, 100, 567, 3982};
            int largest = largestNumber(numbers);
            System.out.println(CheckElement(numbers, 457));
            System.out.println(largest);
    }


    public static int[] reverseNumber(int[] number) {
        int[] reverse = new int[number.length];
        for (int counter = number.length - 1; counter >= 0; counter--) {
            int go = number[counter];
            reverse[(number.length - 1) - counter] = go;
        }
        return reverse;
    }

    public static int totalNumber(int[] number) {
        int total = 0;
        int counter = 0;
        while (counter < number.length) {
            total += number[counter];
            counter++;
        }
        return total;
    }
     static int largestNumber(int[] numbers) {
        int largest = numbers[0];
        int counter = 0;
        while (counter < numbers.length) {
            if (numbers[counter] > largest) {
                largest = numbers[counter];
            }
            counter++;
        }
        return largest;
    }
}
