import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BikeTest{
    Bike suzuki = new Bike();

    @Test
    public void testThatBikeIsOn() {
        //suzuki.isOn(true);
        assertTrue(suzuki.isOn(true));
    }

    @Test
    public void testThatBikeCanBeAccelerated() {
        suzuki.isOn(true);
        suzuki.setGear(1);
        assertEquals(1, suzuki.getGear());
    }

    @Test
    public void testThatBikeCanBeAcceleratedInIncrementOfOne() {
        suzuki.isOn(true);
        suzuki.setGear(1);
        suzuki.setSpeed(15);
        suzuki.setAccelerate();
        assertEquals(16, suzuki.getAcceleration());
    }
    @Test
    public void testThatBikeCanBeAcceleratedInIncrementOfTwo() {
        suzuki.isOn(true);
        suzuki.setGear(2);
        suzuki.setSpeed(24);
        suzuki.setAccelerate();
        assertEquals(26, suzuki.getAcceleration());
    }

    @Test
    public void testThatBikeCanBeAcceleratedInIncrementOfThree() {
        suzuki.isOn(true);
        suzuki.setGear(3);
        suzuki.setSpeed(35);
        suzuki.setAccelerate();
        assertEquals(38, suzuki.getAcceleration());
    }

    @Test
    public void testThatBikeCanBeAcceleratedInIncrementOfFour() {
        suzuki.isOn(true);
        suzuki.setGear(4);
        suzuki.setSpeed(44);
        suzuki.setAccelerate();
        assertEquals(48, suzuki.getAcceleration());
    }

    @Test
    public void testThatBikeCanBeDecelerated() {
        suzuki.isOn(true);
        suzuki.setGear(1);
        assertEquals(1, suzuki.getGear());
    }

    @Test
    public void testThatBikeCanBeDeceleratedInDecrementOfOne() {
        suzuki.isOn(true);
        suzuki.setGear(1);
        suzuki.setSpeed(16);
        suzuki.setDecelerate();
        assertEquals(15, suzuki.getDeceleration());
    }

    @Test
    public void testThatBikeCanBeDeceleratedInDecrementOfTwo() {
        suzuki.isOn(true);
        suzuki.setGear(2);
        suzuki.setSpeed(24);
        suzuki.setDecelerate();
        assertEquals(22, suzuki.getDeceleration());
    }

    @Test
    public void testThatBikeCanBeDeceleratedInDecrementOfThree() {
        suzuki.isOn(true);
        suzuki.setGear(3);
        suzuki.setSpeed(35);
        suzuki.setDecelerate();
        assertEquals(32, suzuki.getDeceleration());
    }

    @Test
    public void testThatBikeCanBeDeceleratedInDecrementOfFour() {
        suzuki.isOn(true);
        suzuki.setGear(4);
        suzuki.setSpeed(44);
        suzuki.setDecelerate();
        assertEquals(40, suzuki.getDeceleration());
    }
}