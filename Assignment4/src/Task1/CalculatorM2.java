package Task1;

// method 2
public class CalculatorM2 {
    private int value;

    public CalculatorM2() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public int reset() {
        value = 0;
        return value;
    }

    public int add(int number) {
        if (number < 0) {
            return value;
        }
        value += number;
        return value;
    }
}
