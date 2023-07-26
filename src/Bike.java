public class Bike {

    private boolean isOn;
    private int gear;
    private int speed;



    public boolean isOn(boolean isOn) {this.isOn = isOn;return isOn;}

    public void setGear(int gear) {this.gear = gear;}

    public int getGear() {return gear;}

    public void setAccelerate() {
        if(gear == 1)
            speed++;
        else if (gear == 2)
            speed = speed + 2;
        else if (gear == 3)
            speed = speed + 3;
        else if (gear == 4)
            speed = speed + 4;}

    public int getAcceleration() {return speed;}
    public int getDeceleration() {return speed;}

    public void setDecelerate() {
        if(gear == 1)
            speed = speed - 1;
           else if (gear == 2)
            speed = speed - 2;
         else if (gear == 3)
            speed = speed - 3;
           else if(gear == 4)
            speed = speed - 4;}

    public void setSpeed(int speed) {this.speed = speed;}
}
