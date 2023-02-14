package two.io.oop;

public class BosnianCaffe extends  Beverage{
    public BosnianCaffe() {
        super("Bosnian Caffe");
    }

    @Override
    public double cost() {
        return 2.3;
    }

    @Override
    public void drink() {
        System.out.println("Bosanska Kahva se ćejfi.");
    }
}
