package classwork_16.car_object.model;

public class Car {

    // принцип: абстрагирование; field
    private String brand; // набор символов
    private int year; // число
    private double price; // число с зпт
    private String color; // набор символов
    private boolean isNew; // true or false

    // constructor - это метод принимает аргументы, но он ничего не возвращает, имеет название по имени класса
    public Car(String brand, int year, double price, String color, boolean isNew) { // аргументы
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }

    // getters and setters - возвращают и устанавливают (позволяют менять значения)


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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    } // end of method

    // свои методы для конкретного класса

    public void move(){
        System.out.println(" Car is moving...."); // эмулируем печатью
    }

    public void stop(){
        System.out.println(" Car stopped.");
    }


} // end of class
