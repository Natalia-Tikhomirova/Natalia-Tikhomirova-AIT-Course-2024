package homework_22.address;

// Создать класс Address, проверить:
// - город с большой буквы
// - индекс содержит 5 цифр
// - предложите еще тесты

public class Address {

    private String city;
    private int index;

   // constructor
    public Address(String city, int index) {
        setCity(city);
        setIndex(index);
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        if (isCityValid(city)) {
            this.city = city;
        } else {
            System.out.println(city + " is NOT valid.");
        }
    }

    private boolean isCityValid(String city){

        if (city == null || city.isEmpty()) {
            return false;
        }
        if (!Character.isUpperCase(city.charAt(0))) {
            return false;
        }
        return true;
    } // end of method



    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if(isIndexValid(index)){
        this.index = index;
        }else {
            System.out.println(index + " is NOT valid. Index must be a 5-digit number.");
        }
    }

    private boolean isIndexValid(int index) {
       // return index >= 10000 && index <= 99999;
        String indexStr = String.valueOf(index);
        return indexStr.length()==5 && index > 0;
    } // end of method


    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", index=" + index +
                '}';
    }
} // end of class


