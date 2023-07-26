package Snacks;


public class EvenPositive {
    public static void main(String[] args) {
        EvenPosition();
    }

    public static void EvenPosition(){
        int[] even = {3, 7, 4, 6, 13, 32};
        for(int counter = 0; counter < even.length; counter++){
            if (counter % 2 == 0){
                System.out.println(even[counter]);
            }
        }
    }
}