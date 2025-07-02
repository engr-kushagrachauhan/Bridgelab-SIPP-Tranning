package Java_Inheritance;

class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(), new Truck(), new Motorcycle()
        };
        ((Car)vehicles[0]).maxSpeed = 180;
        ((Car)vehicles[0]).fuelType = "Petrol";
        ((Car)vehicles[0]).seatCapacity = 5;

        ((Truck)vehicles[1]).maxSpeed = 120;
        ((Truck)vehicles[1]).fuelType = "Diesel";
        ((Truck)vehicles[1]).loadCapacity = 10000;

        ((Motorcycle)vehicles[2]).maxSpeed = 150;
        ((Motorcycle)vehicles[2]).fuelType = "Petrol";
        ((Motorcycle)vehicles[2]).hasSidecar = false;

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}