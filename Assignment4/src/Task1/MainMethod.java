package Task1;

public class MainMethod {

    public static void main(String[] args) {
        CalculatorM3 calculator = new CalculatorM3();
        calculator.add(5);
        calculator.add(10);
        System.out.println("Result " + calculator.getValue());
        calculator.reset();
        System.out.println("After reset " + calculator.getValue());
    }
}
