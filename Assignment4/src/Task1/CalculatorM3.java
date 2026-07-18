package Task1;

// method 3
public class CalculatorM3 {
    // call for value by using private int value
    // create a value by
    private int value;

    // create a method for calculator M3 with value = 0
    public CalculatorM3() {
        value = 0;
    }

    // create a getter for value
    public int getValue() {
        return value;
    }

    // create a reset method for calculation
    public int reset() {
        value = 0;
        return value;
    }

    // create an adding method for positive integer
    // however, if the adding integer is a negative value, return an exception
    public void add(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        value += n;
    }
}