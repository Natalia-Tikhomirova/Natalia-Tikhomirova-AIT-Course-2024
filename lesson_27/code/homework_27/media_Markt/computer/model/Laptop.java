package homework_27.media_Markt.computer.model;

public class Laptop extends Computer {
    private double displaySize;
    private  double weight;
    private int batteryLife;
    private String color;

    public Laptop(long barCode, String cpu, int ram, int ssd, String brand, double price, boolean discount, double displaySize, double weight, int batteryLife, String color) {
        super(barCode, cpu, ram, ssd, brand, price, discount);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
} // end of class
