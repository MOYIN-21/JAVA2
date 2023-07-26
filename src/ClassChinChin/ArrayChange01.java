package ClassChinChin;

public class ArrayChange01 {
    public static void main(String[] args) {

        String[][] letters = new String[][]{
                {"X", "O", "X"},
                {"O", "O", "X"},
                {"O", "X", "X"}};
        for (int counter = 1; counter < letters.length; counter++) {
            for (int index = 1; index < letters[counter].length; index++) {

                if (letters[counter][index].equals("X")) letters[counter][index] = "1";
                System.out.print(letters[counter][index] + " ");
            }
            System.out.println();
        }

    }
}

