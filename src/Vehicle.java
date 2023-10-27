package src;

abstract class Vehicle {

    private String make;
    private int year;
    private int speed;

    public Vehicle(){
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    abstract int acceleration();
}
