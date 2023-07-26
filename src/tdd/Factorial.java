package tdd;

public class Factorial {

    private int answer = 1;

    public void setFactorial(int factorial) {
        int x = factorial;
        while(x > 0){
            answer = answer * x;
            x--;
        }

    }

    public int getFactorial() {
        return answer;
    }

    public int factorialNumber(int input) {
        int result =1;
        if (input == 0) result = 1;

        if(input < 0){
            return 1;
        }
        for (int index = input; index > 0; index--) result*=index;
        return result;
    }
}
