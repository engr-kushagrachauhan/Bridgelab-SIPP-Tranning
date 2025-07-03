package Java_Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int days;
    private String record;

    public InPatient(int id, String name, int age, double dailyRate, int days) {
        super(id, name, age);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    public double calculateBill() {
        return dailyRate * days + 1000; 
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("InPatient Record: " + record);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String record;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("OutPatient Record: " + record);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(101, "Amit", 30, 2000, 3),
            new OutPatient(102, "Riya", 25, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: ₹" + p.calculateBill());
            System.out.println();
        }
    }
}
