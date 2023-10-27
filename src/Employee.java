package src;

public class Employee extends Person{
    private int salary;
    Employee(String firstName, String lastName, Byte age, Integer ssn, Integer salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak(){
        return getFirstName() + " " + getLastName() + " " + this.salary;
    }


}
