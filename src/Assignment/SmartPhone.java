package Assignment;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
    private int currentVolume;
    private String connectedNetwork;

    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = null;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the device...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the device...");
    }

    @Override
    public void increaseVolume(int level) {
        currentVolume += level;
        System.out.println("Increasing volume by " + level + " levels.");
    }

    @Override
    public void decreaseVolume(int level) {
        currentVolume -= level;
        if (currentVolume < 0) currentVolume = 0;
        System.out.println("Decreasing volume by " + level + " levels.");
    }

    @Override
    public void connectToWiFi(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("Disconnecting from WiFi...");
        connectedNetwork = null;
    }
}