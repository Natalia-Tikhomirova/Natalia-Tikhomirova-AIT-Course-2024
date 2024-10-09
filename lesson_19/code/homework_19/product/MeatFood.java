package homework_19.product;

// Создать класс MeatFood расширяющий класс Food с полем private String meatType,которое хранит тип мяса из которого изготовлен продукт.

public class MeatFood  extends Food{

    private String meatType;

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                "} " + super.toString();
    }

} // end of class
