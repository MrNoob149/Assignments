package Task3;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
    void honk();
}

interface EletricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, EletricVehicle {
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

    @Override
    public void charge() {
        System.out.println("Not possible to charge");
    }
}

class EletricMotorcycle extends AbstractVehicle {
    public EletricMotorcycle() {
        super("EletricMotorcycle", "Eletric", "Black");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n"
                + "Type: Electric Car\n"
                + "Fuel: Electric\n"
                + "Color: Black";
    }

    @Override
    public void charge() {
        System.out.println("Charging");
    }

}

class EletricCar extends AbstractVehicle {
    public EletricCar() {
        super("eletric Car", "eletric", "White");
    }
    @Override
    public String getInfo() {
        return "Electric Car Information:\n"
                + "Type: Electric Car\n"
                + "Fuel: Electric\n"
                + "Color: White";
    }

    @Override
    public void charge() {
        System.out.println("Charging");
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

public class Task3 {
    private static void VehicleMain(AbstractVehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        System.out.println(vehicle.getInfo());
        vehicle.honk();
        vehicle.charge();
    }

    public static void main(String[] args){

        AbstractVehicle Car = new Car();
        AbstractVehicle motorcycle = new Motorcycle();
        AbstractVehicle bus = new Bus();
        AbstractVehicle eletricCar = new EletricCar();
        AbstractVehicle eletricMotorcycle = new EletricMotorcycle();

        VehicleMain(Car);
        VehicleMain(motorcycle);
        VehicleMain(bus);
        VehicleMain(eletricCar);
        VehicleMain(eletricMotorcycle);

    }
}
