package homework_26.warehouse.detail.model;

// Дочерний класс Gear (шестеренка) с полями:
// radius:  double
// tooth:  int

public class Gear extends Detail{

    // fields
    private double radius;
    private int tooth;

    // constructor
    public Gear(long barCode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    // getter and setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

} // end of class
