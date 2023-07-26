package PlayingGround;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] mean = new double[8];
        for (int counter = 0; counter < mean.length; counter++) {
            mean[counter] = 7;

        }
        System.out.println(Arrays.toString(mean));

        for (int counter = 0; counter < mean.length; counter++) {
            mean[counter] = 7;
            if (counter % 2 != 0) {
                mean[counter] -= 1.5;
            }
        }
        System.out.println(Arrays.toString(mean));

        for (int counter = 0; counter < mean.length; counter++) {
            if (counter % 2 == 0) {
                mean[counter] += 2.3;
                mean[counter] -= 4.7;
            }
        }
        System.out.println(Arrays.toString(mean));
    }
}
