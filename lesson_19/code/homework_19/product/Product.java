package homework_19.product;

// В Задаче 1 переопределить метод equals для сравнения объектов во всех классах.


import java.util.Objects;

public class Product {

    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }

    // Метод для поиска продукта по бар-коду
    public static Product findProductByBarCode(Product[]products, long barCode){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getBarCode() == barCode){
                return products[i];  // Возвращаем продукт, если бар-код совпадает
            }
        } // end of for

        return null;                                          // Возвращаем null, если продукт не найден

    } // end of method


} // end of class
