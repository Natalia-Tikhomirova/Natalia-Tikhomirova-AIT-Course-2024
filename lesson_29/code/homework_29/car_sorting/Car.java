package homework_29.car_sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Car implements Comparable <Car>{

    private String regNumber;
    private String brand;
    private int year;
    private double price;
    private String color;

    public Car(String regNumber, String brand, int year, double price, String color) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(regNumber, car.regNumber) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, brand, year, price, color);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(@NotNull Car car) {
        return this.year - car.year;
    }
} // end of class
