package src;

public class Truck extends Vehicle{

    public Truck(String make, int year, int speed){
        super.setMake(make);
        super.setYear(year);
        super.setSpeed(speed);
    }

    public int acceleration(){
        return super.getSpeed();
    }
}
