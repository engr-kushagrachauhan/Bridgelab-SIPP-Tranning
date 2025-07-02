package Java_Inheritance;

interface Refuelable {
    void refuel();
}

class Vehicles {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicles {
    void charge() {
        System.out.println("Charging " + model);
    }
}

class PetrolVehicle extends Vehicles implements Refuelable {
    public void refuel() {
        System.out.println("Refueling " + model);
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.model = "Tesla";
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle();
        pv.model = "Honda City";
        pv.refuel();
    }
}