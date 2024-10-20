package homework_27.media_Markt.computer.model;

import java.util.Objects;

public abstract class Computer {

    protected long barCode;
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;
    protected double price;
    protected boolean discount;

    public Computer(long barCode, String cpu, int ram, int ssd, String brand, double price, boolean discount) {
        this.barCode = barCode;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return barCode == computer.barCode && Double.compare(price, computer.price) == 0 && discount == computer.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, price, discount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("barCode=").append(barCode);
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", discount=").append(discount);
        sb.append('}');
        return sb.toString();
    }
} // end of class
