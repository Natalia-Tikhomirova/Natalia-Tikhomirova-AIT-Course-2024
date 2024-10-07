package homework_18.computer_shop.model;

public class Laptop extends Computer {

    private double displaySize;
    private  double weight;
    private int batteryLife;
    private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
} // end of class
