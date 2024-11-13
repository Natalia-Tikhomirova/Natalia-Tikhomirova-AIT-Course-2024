package homework_44.travel_agency.model;

// Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис. Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны. Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.

// Необходимо ответить на вопросы:
// - Какие страны наиболее популярны?
// - Кто из клиентов посетил наибольшее количество стран?



import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TouristAppl {
    public static void main(String[] args) {


        // data set
        System.out.println("=========================List of tourists============================");
        List<Tourist> tourists = getTourists();
        tourists.forEach(System.out::println);

        // print countries
        System.out.println("=====================List of countries==========================");
        printCountries(tourists);

        // country -> frequancy
        System.out.println("=================== Countries rating ===========================");
        sortCountriesByFrequency(tourists);

        System.out.println("=============Client with most countries==========================");
        printMostCountriesClient(tourists);
    }

    private static void printCountries(List<Tourist> tourists) {
        List<String> countries = tourists.stream()
                .map(Tourist::getCountries)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(countries);
    }

    private static void sortCountriesByFrequency(List<Tourist> tourists) {
        Map<String,Long> countriesByFrequency  = tourists.stream()
                .map(Tourist::getCountries)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(
                        countries -> countries,
                        Collectors.counting()
                ));
        countriesByFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> System.out.printf("Country: %s, Popularity: %d%n", entry.getKey(), entry.getValue()));
    }

    private static void printMostCountriesClient(List<Tourist> tourists) {

        tourists.stream()
                .collect(Collectors.toMap(
                      Tourist::getName,
                      t -> new HashSet<>(t.getCountries()).size(),
                      Integer::max
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresentOrElse(
                        entry -> System.out.println("Client who visited the more number of countries: " + entry.getKey() + ", Number of countries: " + entry.getValue()),
                () -> System.out.println("The list of tourists is empty.")
                );
    }

    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Olesia",List.of( "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain")),
                new Tourist("Bilbo Baggins",List.of( "Italy", "Spain", "Turkey")),
                new Tourist("Tatyana",List.of( "Italy", "Spain", "Italy", "Greece", "Turkey")),
                new Tourist("Anton", List.of("Germany", "Nederland", "Turkey", "Georgia")),
                new Tourist("Sergei_B",List.of( "Tunis", "Turkey", "China", "Vietnam")),
                new Tourist("Galina",List.of( "Italy", "France", "Italy")),
                new Tourist("Anatoly", List.of( "Montenegro", "Albania", "Greece", "Italy")),
                new Tourist("Andrii", List.of("UK", "Ireland", "Spain")),
                new Tourist("Liubov",List.of("Croatien", "Slovenien", "Spain", "France", "Egypt")),
                new Tourist("Liam", List.of("Spain", "Portugal", "Morocco", "Cyprus")),
                new Tourist("Emma", List.of("Greece", "Turkey", "Croatia", "Montenegro")),
                new Tourist("Mia", List.of( "Italy", "Malta", "Spain", "Turkey")),
                new Tourist("Noah", List.of("Turkey", "Greece", "Italy", "Croatia")),
                new Tourist("Olivia",List.of( "Croatia", "Montenegro", "Albania", "Greece")),
                new Tourist("Lucas", List.of("Portugal", "Spain", "France", "Italy")),
                new Tourist("Amelia", List.of("Greece", "Cyprus", "Spain", "Italy")),
                new Tourist("Oliver", List.of("Spain", "Italy", "Turkey", "Greece")),
                new Tourist("Isabella", List.of("France", "Spain", "Italy", "Greece")),
                new Tourist("Ethan", List.of("Italy", "Greece", "Spain", "Croatia")),
                new Tourist("Ava", List.of("Greece", "Turkey", "Spain", "Italy")),
                new Tourist("Liam", List.of("Spain", "Italy", "Morocco", "Greece")),
                new Tourist("Sophia", List.of("Italy", "Spain", "Turkey", "Greece")),
                new Tourist("Jackson", List.of("Greece", "Spain", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Greece", "Italy", "Montenegro")),
                new Tourist("Logan", List.of("Spain", "Greece", "Italy", "Turkey")),
                new Tourist("Emma", List.of("Greece", "Italy", "Spain", "Cyprus")),
                new Tourist("Aiden", List.of("Italy", "Greece", "Spain", "Turkey"))

        );
    }
} // end of class
