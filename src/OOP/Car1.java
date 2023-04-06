package OOP;

public class Car1 extends Vehicle {
    public int year;

    public Car1(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }
}
