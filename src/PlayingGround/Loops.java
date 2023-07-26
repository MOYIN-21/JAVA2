package PlayingGround;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i ++){
            int j=0;
            while (j < i){
                System.out.println(j + " ");
                j++;
            }
        }

        int i = 5;
        while (i >= 1){
            int num = 1;
            for (int j = i; j <= i; j ++){
                System.out.print(num + "xxx");
            }
            System.out.println();
            i--;
        }
    }
}
