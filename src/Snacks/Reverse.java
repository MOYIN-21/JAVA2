package Snacks;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] vert = {2, 4, 5, 6};
        int[] joy = reverseNumber(vert);
        System.out.println(Arrays.toString(joy));
    }

        public static int[] reverseNumber (int[] number){
            int[] reverse = new int[number.length];
            for (int counter = number.length - 1; counter >= 0; counter--) {
                int go = number[counter];
                reverse[(number.length - 1) - counter] = go;
            }
            return reverse;
    }
}



