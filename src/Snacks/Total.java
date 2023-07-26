package Snacks;

public class Total {
    public static void main(String[] args) {
        int [] num = {2, 5, 8, 7, 6, 9, 0, 4, 3, 12, 23, 20};
                int total = 0;
        int counter = 0;
        while (counter < num.length) {
                total+=num[counter];
            counter++;
        }
        System.out.println("The total is:" + total);
        }
}

