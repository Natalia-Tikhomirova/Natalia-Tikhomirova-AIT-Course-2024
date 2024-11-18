package classwork_48.project_exchange;

// Убедитесь, что в списке нет дублирующихся кодов валют.
// Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя выбрать желаемую валюту,
// ввести ее количество и узнать, сколько он получит при обмене на евро.


import homework_39.bank.CurrencyRates;

import java.util.*;


public class CurrencyRatesAppl {
    public static void main(String[] args) {


        // Убедитесь, что в списке нет дублирующихся кодов валют.

        Set<String> uniqueCodes = new HashSet<>();

        for (CurrencyRates currency : CurrencyRates.values()) {
            if(!uniqueCodes.add(currency.getIso())){
                System.out.println("Duplicate currency code found: " + currency.getIso());
            }
        }


        // Выведите список валют и их курсов на экран.
        Set<CurrencyRates> currencyRates = EnumSet.allOf(CurrencyRates.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("List of currencies: ");
        printCurrencyRates(currencyRates);

        System.out.println("Enter currency: ");
        String currencyIso = scanner.nextLine().toUpperCase(); // преобразует все символы строки в верхний регистр

        // Получаем валюту по ISO-коду
        Optional<CurrencyRates> selectedCurrencyOpt = CurrencyRates.getByIso(currencyIso);
        if (selectedCurrencyOpt.isEmpty()) {
            System.out.println("Invalid currency ISO code.");
            return;
        }

        CurrencyRates selectedCurrency = selectedCurrencyOpt.get();
        System.out.print("Enter the amount of " + currencyIso + " : ");

        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            double resInEuros = amount / selectedCurrency.getRateToEuro();
            System.out.println("Amount in euros: " + resInEuros);
        }else{
            System.out.println("Invalid amount entered.");
        }
    }


    private static void printCurrencyRates(Set<CurrencyRates> currencyRates) {

        for (CurrencyRates currency : currencyRates) {
        System.out.println("Currency: " + currency.getIso()+ " | " + currency.getRateToEuro());
        }
    }


} // end of class
