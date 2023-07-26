package tdd;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public boolean isOn(boolean isOn) {
        this.isOn = isOn;
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setIncreaseTemperature(int increaseTemperature){;
        if(increaseTemperature > 30){
            temperature++;
        }
    }

    public int getIncreaseTemperature() {
        return temperature;
    }

    public void setDecreaseTemperature(int decreaseTemperature) {
        if(decreaseTemperature > 16){
            temperature--;
        }

    }

    public int getDecreaseTemperature() {
        return temperature;
    }
}
