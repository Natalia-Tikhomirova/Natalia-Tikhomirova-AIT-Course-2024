package homework_26.warehouse.detail.model;

// Дочерний класс Lever (рычаг) с полями:
//power: double

public class Lever extends Detail {

    // fields
    private double power;

    // constructor

    public Lever(long barCode, double size, String material, String vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }

    // getter and setter

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

} // end of class
