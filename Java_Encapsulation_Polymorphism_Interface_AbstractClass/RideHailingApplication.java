package Java_Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car1 extends Vehicle implements GPS {
    private String location;

    public Car1(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // Base charge
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 30; // Meter start
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car1("V101", "Rahul", 15),
            new Bike("V102", "Sunil", 10),
            new Auto("V103", "Anil", 12)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10km: ₹" + v.calculateFare(10));
            System.out.println();
        }
    }
}
