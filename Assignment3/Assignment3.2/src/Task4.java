package Task4;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
    void honk();
    double calculateFuelEfficiency();

}

interface EletricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, EletricVehicle {
    protected String Type;
    protected String Fuel;
    protected String Color;
    protected double FuelEfficiency;
    protected double DistanceTraveled;

    public AbstractVehicle(String Type, String Fuel, String Color, double FuelEfficiency, double DistanceTraveled) {
        this.Type = Type;
        this.Fuel = Fuel;
        this.Color = Color;
        this.FuelEfficiency = FuelEfficiency;
        this.DistanceTraveled = DistanceTraveled;
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
        System.out.println(Type + " Is honking");
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge");
    }


}

class EletricMotorcycle extends AbstractVehicle {
    public EletricMotorcycle() {
        super("EletricMotorcycle", "Eletric", "Black", 50, 120);
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

    @Override
    public double calculateFuelEfficiency() {
        return DistanceTraveled / FuelEfficiency;
    }

}

class EletricCar extends AbstractVehicle {
    public EletricCar() {
        super("eletric Car", "eletric", "White", 30, 200);
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

    @Override
    public double calculateFuelEfficiency () {
        return DistanceTraveled / FuelEfficiency;
    }

}



class Car extends AbstractVehicle {

    public Car() {
        super("car", "Petrol", "Red", 100, 300);
    }

    @Override
    public String getInfo() {
        System.out.println("Car Information:\n" +
                "Type: Car\n" +
                "Fuel: Petrol\n" +
                "Color: Red\n");
        return null;
    }

    @Override
    public double calculateFuelEfficiency() {
        return DistanceTraveled / FuelEfficiency;
    }

}

class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline", "Black", 80, 240);
    }

    @Override
    public String getInfo() {
        System.out.println("Motorcycle Information:\n" +
                "Type: Motorcycle\n" +
                "Fuel: Gasoline\n" +
                "Color: Black");
        return "";
    }

    @Override
    public double calculateFuelEfficiency() {
        return DistanceTraveled / FuelEfficiency;
    }

}

class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", "Diesel", "Red", 90, 280);
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

    @Override
    public double calculateFuelEfficiency() {
        return DistanceTraveled / FuelEfficiency;
    }

}

public class Task4 {
    private static void VehicleMain(AbstractVehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        System.out.println(vehicle.getInfo());
        vehicle.honk();
        vehicle.charge();
        System.out.println("Fuel efficiency: "
                + vehicle.calculateFuelEfficiency());    }

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
