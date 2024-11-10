package homework_42;
 // Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли.
 // Подсчитайте количество стран на континентах из полученного списка.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountrysMap {
    public static void main(String[] args) {

        Map<String, List<String>> countriesContinentMap = new HashMap<>();

        // Africa
        countriesContinentMap.put("Africa", Arrays.asList("Nigeria","Egypt","South Africa","Kenya"));

        // Asia
        countriesContinentMap.put("Asia", Arrays.asList("China","India","Japan"));

        // Europe
        countriesContinentMap.put("Europe", Arrays.asList("Germany","France","Italy","Austria","Holland","Poland"));

        // North America
        countriesContinentMap.put("North America", Arrays.asList("United States","Canada","Mexico" ));

        // South America
        countriesContinentMap.put("South America",Arrays.asList("Brazil","Argentina","Chile","Brasilien","Peru"));

        // Australia/Oceania
        countriesContinentMap.put("Oceania",Arrays.asList("Australia","Fiji","kiribati","Nauru","Palau","Samoa"));


        for (Map.Entry<String,List<String>> entry : countriesContinentMap.entrySet()) {
            System.out.println(entry.getKey() + " : "  + entry.getValue().size());
        }
    }
} // end f class


