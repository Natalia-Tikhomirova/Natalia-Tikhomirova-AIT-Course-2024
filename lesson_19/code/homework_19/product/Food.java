package homework_19.product;

// Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности.

public class Food extends Product {

    private String expDate; // дата истечения срока годности.

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                "} " + super.toString();
    }

} // end of class
