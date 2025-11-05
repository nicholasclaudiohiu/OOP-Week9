package Assignment;

public class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Device Info: Brand: " + brand + ", Model: " + model);
    }

    interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }
}