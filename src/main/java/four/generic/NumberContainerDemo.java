package four.generic;

public class NumberContainerDemo {
    public static void main(String[] args) {
        //E extends Number
        NumberContainer<Integer> numberContainer = new NumberContainer<>() ;
        numberContainer.add(23);
    }
}
