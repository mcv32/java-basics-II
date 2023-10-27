package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        module1();
         module2();
         module3();
         module4();
         module5();
    }

    public static void module1(){
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());
    }
    public static void module2(){
        var myTable = new Table(4);
    }
    public static void module3(){
        var car = new Car("Honda", 2005, 50);
        var truck = new Truck("Chevrolet", 2007, 60);
    }

    public static void module4(){
        var employee = new Employee("Jason", "Li", (byte) 22, 123456789, 150);
        System.out.println(employee.speak());
    }

    public static void module5() {
        var sports = new ArrayList<Sport>();
        var soccer = new Soccer();
        var basketball = new Basketball();
        sports.add(soccer);
        sports.add(basketball);
        for (Sport s : sports) {
            System.out.println(s.name());
        }
    }

}
