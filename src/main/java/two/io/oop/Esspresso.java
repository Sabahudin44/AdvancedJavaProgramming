package two.io.oop;

public class Esspresso extends Beverage {
    public Esspresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Pijem Espresso...");
    }
}
