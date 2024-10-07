package classwork_18.computr_shop.model;

// создать класс Smartphone, расширяющий класс Laptop с полем private long imei. В классе Smartphone переопределить метод toString. В методе main добавить объект Smartphone, и распечатать его в консоль.

public class Smartphone extends Laptop {

    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                "} " + super.toString();
    }

} // end of class
