package tdd;

import org.junit.jupiter.api.Test;
import tdd.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialTest {
    private Factorial factorial = new Factorial();
    @Test
    public void testThatNumberCanBeFactorialized(){
        factorial.setFactorial(5);
        assertEquals(120,factorial.getFactorial());
    }
    @Test
    public void testThatNumberCanBeFactorializedA(){
        factorial.setFactorial(6);
        assertEquals(720,factorial.getFactorial());
    }
    @Test
    public void testThatNumberCanBeFactorializedAB(){
        assertEquals(24, factorial.factorialNumber(4));
    }


}
