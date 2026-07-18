package Task2;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
    void honk();
}

abstract class AbstractVehicle implements Vehicle {
    protected String Type;
    protected String Fuel;
    protected String Color;

    public AbstractVehicle(String Type, String Fuel, String Color) {
        this.Type = Type;
        this.Fuel = Fuel;
        this.Color = Color;
    }

    @Override
    public void start() {
        System.out.println( Type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println( Type + " is stopping...");
    }

    @Override
    public String getInfo() {
        System.out.println("The type of this vehicle is " + Type);
        System.out.println("This vehicle have " + Fuel);
        System.out.println("The color of this vehicle is " + Color);
        return "";
    }

    @Override
    public void honk() {
        System.out.println(Type + "Is honking");
    }
}

class Car extends AbstractVehicle {

    public Car() {
        super("car", "Petrol", "Red");
    }

    @Override
    public String getInfo() {
        System.out.println("Car Information:\n" +
                "Type: Car\n" +
                "Fuel: Petrol\n" +
                "Color: Red\n");
        return null;
    }
}

class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline", "Black");
    }

    @Override
    public String getInfo() {
        System.out.println("Motorcycle Information:\n" +
                "Type: Motorcycle\n" +
                "Fuel: Gasoline\n" +
                "Color: Black");
        return "";
    }
}

class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", "Diesel", "Red");
    }

    @Override
    public void start() {
        System.out.println("The bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("The bus is stopping...");
    }

    @Override
    public String getInfo() {
        System.out.println("Bus Information:\n" +
                "Type: Bus\n" +
                "Fuel: Diesel\n" +
                "Capacity: 40 passengers");
        return null;
    }
}

public class Task2 {
    private static void VehicleMain(AbstractVehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        System.out.println(vehicle.getInfo());
        vehicle.honk();
    }

    public static void main(String[] args){

        AbstractVehicle Car = new Car();
        AbstractVehicle motorcycle = new Motorcycle();
        AbstractVehicle bus = new Bus();

        VehicleMain(Car);
        VehicleMain(motorcycle);
        VehicleMain(bus);

    }
}
