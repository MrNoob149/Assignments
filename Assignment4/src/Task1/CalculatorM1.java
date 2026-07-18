package Task1;

// method 1
public class CalculatorM1 {

    private int value;


    public CalculatorM1() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public int reset() {
        value = 0;
        return value;
    }

    public int removenegativenumber(int number) {
        if (number < 0) {
            return value;
        } else {
            value += number;
            return value;
        }
    }

}
