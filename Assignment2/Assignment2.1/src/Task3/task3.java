package Task3;

public class task3 {

    public static void main(String[] args) {

        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.pressOnOff();

        if (myCoffeeMaker.isOn()) {
            System.out.println("Coffee maker is on");
        }

        myCoffeeMaker.setCoffeeType("espresso");
        myCoffeeMaker.setCoffeeAmount(50);

        System.out.println("Coffee type is " +
                myCoffeeMaker.getCoffeeType());

        System.out.println("Coffee amount is " +
                myCoffeeMaker.getCoffeeAmount() + " ml");

        myCoffeeMaker.pressOnOff();

        if (!myCoffeeMaker.isOn()) {
            System.out.println("Coffee maker is off");
        }
    }
}