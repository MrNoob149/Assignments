The idea of the program is to create a simple program that allow user to calculate given value and will throw an exception if the input is a negative value. <br>
Here is the following code: <br>
- Method 1:  <br>
<code>package Task1;
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
 </code>

In this code, we have "value" as a private variable that store the current value of the calculator. The constructor initializes the value to 0. The "getValue" method returns the current value, and the "reset" method resets the total back to 0 and returns the new value. The "removenegativenumber" method takes an integer input and checks if it is negative. If the input is negative, it simply returns the current value without making any changes. If the input is non-negative, it adds the input to the current value and returns the updated value.

- Method 2 <br>
<code>package Task1;
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
 </code>

In this code, we have "value" as a private variable that stores the current value of the calculator. The constructor initializes the value to 0. The "getValue" method returns the current value, and the "reset" method resets the total back to 0 and returns the new value. The "add" method takes an integer input and checks if it is negative. If the input is negative, it simply returns the current value without making any changes. If the input is non-negative, it adds the input to the current value and returns the updated value. The difference between CalculatorM1 and CalculatorM2 is that in CalculatorM1, the method is named "removenegativenumber" while in CalculatorM2, the method is named "add". Both methods perform the same functionality of checking for negative input and updating the value accordingly but method name "Add" is much clearer than removenegativenumber for describing its purpose.

- Method 3 <br>
<code>package Task1;
method 3
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
 </code>

In this code, we have "value" as a private variable that stores the current value of the calculator. The constructor initializes the value to 0. The "getValue" method returns the current value, and the "reset" method resets the total back to 0 and returns the new value. The "add" method takes an integer input and checks if it is negative. If the input is negative, it throws an IllegalArgumentException with a message indicating that only positive integers are allowed. If the input is non-negative, it adds the input to the current value. This method provides a more explicit way of handling invalid input by throwing an exception instead of silently ignoring it, which can help users understand that their input was invalid. The difference from the previous methods is that it uses exception handling to manage negative inputs, instead of silently ignoring negative inputs. Method "add" returns void instead of int