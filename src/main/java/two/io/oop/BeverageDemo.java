package two.io.oop;

public class BeverageDemo {
    public static void main(String[] args) {
      //FileReader fileReader = new FileReader();
      Esspresso esspresso = new Esspresso();
      //BufferedReader reader = new BufferedReader();
      MilkDecorator milkDecorator = new MilkDecorator(esspresso);
      milkDecorator.drink();
      milkDecorator.print();
      esspresso.drink();
      esspresso.print();

      Tea tea = new Tea();
      MilkDecorator beverage = new MilkDecorator(tea);

      tea.drink();
      tea.print();
      beverage.drink();
      beverage.print();
    }
}
