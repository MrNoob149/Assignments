package Task2;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        Car myCar2;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();
        myCar2 = new Car("Ferrari", 50, 120);
        myCar2.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        for (int i = 0; i < 6; i++) {
            myCar2.accelerate();
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar2.decelerate(15);
            System.out.println(myCar2.getTypeName() + ": speed is " + myCar2.getSpeed() + " km/h");
        }
    }
}