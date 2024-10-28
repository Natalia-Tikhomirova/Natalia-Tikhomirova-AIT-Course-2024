package classwork_33.coffee_mashine;

// **Задача 3.**
//Используя enum, напишите программу для продажи 4-х видов кофе:
//ESPRESSO,
//AMERICANO,
//CAPPUCCINO,
//LATTE
//Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.

public enum Coffee {
    ESP("Espresso",2.5,1),AMR("Americano",3.0,2),CAP("Cappuccino",4.0,3),LAT("Latte",4.9,4);

    // fields
     private String type;
     private double price;
     private int choice;

    Coffee(String type, double price, int choice) {
        this.type = type;
        this.price = price;
        this.choice = choice;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("type='").append(type).append('\'');
        sb.append(", price=").append(price);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }


} // end of class
