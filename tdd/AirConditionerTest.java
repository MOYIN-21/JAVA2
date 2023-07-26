import org.junit.Test;
import tdd.AirConditioner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirConditionerTest{
    AirConditioner lawand = new AirConditioner();

    @Test
    public void airConditionerIsOnTest(){
       // AirConditioner lawand = new AirConditioner();
        lawand.isOn(true);
        assertTrue(lawand.isOn(true));
    }

    @Test
    public void airConditionerHasTemperatureTest(){
        lawand.isOn(true);
        lawand.setTemperature(17);
        assertEquals(17,lawand.getTemperature());
    }


    @Test
    public void airConditionerCanNotBeIncreasedAboveTemperatureTest(){
        lawand.isOn(true);
        lawand.setTemperature(30);
        lawand.setIncreaseTemperature(1);
        assertEquals(30,lawand.getIncreaseTemperature());
    }

    @Test
    public void airConditionerTemperatureCanBeDecreaseTest(){
        lawand.isOn(true);
        lawand.setTemperature(30);
        lawand.setDecreaseTemperature(1);
        assertEquals(30,lawand.getDecreaseTemperature());
    }
    @Test
    public void airConditionerCanNotBeDecreasedBelowTemperatureTest(){
        lawand.isOn(true);
        lawand.setTemperature(16);
        lawand.setDecreaseTemperature(1);
        assertEquals(16,lawand.getDecreaseTemperature());
    }







    }