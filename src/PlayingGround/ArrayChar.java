package PlayingGround;

import java.util.Arrays;

public class ArrayChar {
    public static void main(String[] args) {
        String[] mean = new String[10];
        for (int counter = 0; counter < mean.length; counter++) {
            mean[counter] = "L";
            mean[9] = "E";
        }
        System.out.println(Arrays.toString(mean));

        for (int counter = 0; counter < mean.length; counter++) {
            if (counter % 2 == 0) {
                mean[counter] = "A";
            }
        }
        System.out.println(Arrays.toString(mean));

        for (int counter = 0; counter < mean.length; counter++) {
            if (counter % 2 != 0) {
                mean[counter] = "F";
            }
        }
        System.out.println(Arrays.toString(mean));
        for(int counter = 0; counter < mean.length; counter++) {
            mean[counter] = "5";
        }
        System.out.println(Arrays.toString(mean));
    }
}
