package Task2;

public class Bus extends Car{
    double passenger = 0;
    public Bus(String typeName, double speed, double gasolineLevel, double passenger) {
        super(typeName, speed, gasolineLevel);
        this.passenger = passenger;

    }

    public void PassengerEnter() {
        passenger++;
    }

    public void PassengerExit() {
        passenger--;
    }

}
