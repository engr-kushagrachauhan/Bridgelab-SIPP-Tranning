package Java_Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }
}

class car extends vehicle implements Insurable {
    public car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "car", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class bike extends vehicle implements Insurable {
    public bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.08;
    }

    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class truck extends vehicle implements Insurable {
    public truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Extra charge
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }
    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<vehicle> rentals = new ArrayList<>();
        rentals.add(new car("CAR101", 1500, "CAR-POL-001"));
        rentals.add(new bike("BIKE202", 500, "BIKE-POL-002"));
        rentals.add(new truck("TRK303", 3000, "TRK-POL-003"));
        int days = 5;
        for (vehicle v : rentals) {
            v.displayInfo();
            System.out.println("Rental for " + days + " days: ₹" + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance: ₹" + i.calculateInsurance());
                System.out.println(i.getInsuranceDetails());
            }
            System.out.println("------------------------");
        }
    }
}