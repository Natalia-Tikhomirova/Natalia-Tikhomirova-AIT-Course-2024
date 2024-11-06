package homework_39.bank;

//Создайте enum с кодами валют и их текущими курсами к евро.


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public enum CurrencyRates {
    EUR("EUR", 1.00), USD("USD", 1.0897), JPY("JPY", 165.93), GBP("GBP", 0.8392), CNY("CNY", 7.7405), CHF("CHF", 0.9402), CAD("CAD", 1.5128), AUD("AUD", 1.6452), TRY("TRY", 37.4292), RUB("RUB", 111.45);

    // fields

    private String iso;
    private double rateToEuro;


    CurrencyRates(String iso, double rateToEuro) {
        this.iso = iso;
        this.rateToEuro = rateToEuro;
    }


    public String getIso() {
        return iso;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrencyRates{");
        sb.append("iso='").append(iso).append('\'');
        sb.append(", rateToEuro=").append(rateToEuro);
        sb.append('}');
        return sb.toString();
    }

    // Метод для поиска по ISO-коду
    public static Optional<CurrencyRates> getByIso(String iso) {
        for (CurrencyRates currency : values()) {
            if (currency.iso.equalsIgnoreCase(iso)) {
                return Optional.of(currency);
            }
        }
        return Optional.empty();
    }
} // end of class




