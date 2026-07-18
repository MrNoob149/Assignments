interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping...");
    }

    @Override
    public String getInfo() {
        System.out.println("Car Information:\n" +
                "Type: Car\n" +
                "Fuel: Petrol\n" +
                "Color: Red\n");
        return "";
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("The motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle is stopping...");
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

class Bus implements Vehicle {

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
        return "";
    }
}

public class Task1 {
    private static void VehicleMain(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();
    }

    public static void main(String[] args){
        Vehicle car = new Car();
        car.start();
        car.stop();
        car.getInfo();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();

        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        bus.getInfo();

        VehicleMain(new Car());
        VehicleMain(new Motorcycle());
        VehicleMain(new Bus());
    }
}
