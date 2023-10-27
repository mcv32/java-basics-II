package src;

public class Car extends Vehicle{
    public Car(String make, int year, int speed){
        super.setMake(make);
        super.setYear(year);
        super.setSpeed(speed);
    }

    public int acceleration() {
        return super.getSpeed() * 2;
    }

}
