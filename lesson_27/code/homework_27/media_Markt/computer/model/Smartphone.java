package homework_27.media_Markt.computer.model;

public class Smartphone extends Laptop {

    private long imei;

    public Smartphone(long barCode, String cpu, int ram, int ssd, String brand, double price, boolean discount, double displaySize, double weight, int batteryLife, String color, long imei){
        super(barCode, cpu, ram, ssd, brand, price, discount, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }
} // end of class
