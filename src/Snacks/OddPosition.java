package Snacks;
public class OddPosition {
    public static void main(String[] args) {
        oddPosition();
    }

    private static void oddPosition() {
        int[] vert = {3, 7, 4, 6, 13, 32};
        for (int counter = 0; counter < vert.length; counter++) {
            if (counter % 2 != 0) {
                System.out.println(vert[counter]);
            }
        }
    }
}