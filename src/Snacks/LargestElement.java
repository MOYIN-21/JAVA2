package Snacks;

public class LargestElement {
        public static void main(String[] args) {
            int[] numbers = {457, 984, 324, 694, 100, 567, 3982};
            int largest = largestNumber(numbers);
            System.out.println(largest);
        }

        public  static int largestNumber(int[] numbers) {
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