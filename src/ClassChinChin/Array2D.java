package ClassChinChin;

public class Array2D {
    public static void main(String[] args) {
        String[][] letters = new String[][]{
            {"X", "O", "X"},
            {"O", "O", "X"},
            {"O", "X", "X"}
        };
        for (int counter = 0; counter < letters.length; counter++) {
            for (int index = 0; index < letters[counter].length; index++) {
                    System.out.println(letters[counter][index] + ' ');
            }
                }
                System.out.println();
            }
        }