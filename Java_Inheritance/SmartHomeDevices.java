package Java_Inheritance;

class Device {
    String deviceId;
    String status;

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "TH-101";
        t.status = "Active";
        t.temperatureSetting = 24;
        t.displayStatus();
    }
}