import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mp3Test {
    Mp3 oraimo = new Mp3();

    @Test
    public void testThatMp3IsOn(){
       // oraimo.isOn(true);
        assertTrue(oraimo.isOn(true));
    }
    @Test
    public void testThatMp3CanBeIncreasedInVolume(){
      //  Mp3 oraimo = new oraimo(){
          //  oraimo.isOn(true);
            oraimo.setVolume(2);
            assertEquals(2,oraimo.getVolume());
    }
    @Test
    public void testThatMp3CanNotIncreaseAboveVolume(){



    }


}
