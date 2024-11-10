package classwork_42.map_examples;

//  сформируем Map - города и их население

import java.awt.*;
import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

            // k,    v
        Map<String,Integer> cityMap = new TreeMap<>();
        cityMap.put("Hamburg",1_800_000);
        cityMap.put("Berlin",3_500_000);
        cityMap.put("Munich",1_500_000);
        cityMap.put("Cologne",1_080_000);
        cityMap.put("Ingolstadt",140_000);
        cityMap.put("Augsburg",350_000);
        cityMap.put("Isny",14_835);
        cityMap.put("Odessa",1_500_000);


        System.out.println(cityMap.size()); // 8
        System.out.println(cityMap.isEmpty()); // false

        System.out.println("____________________________________________________________");
        Integer population = cityMap.get("Berlin");
        System.out.println(population);

        population = cityMap.get("Hamburg");
        System.out.println(population);

        System.out.println("_______________________contains key___________________________");

        System.out.println(cityMap.containsKey("Hamburg")); // true
        System.out.println(cityMap.containsKey("Willich")); // false

        System.out.println("_______________________total population___________________________");

        // cityMap.values().forEach(p -> totalPopulation += p);

        int totalPopulation = 0;
        ArrayList<Integer> tp = new ArrayList<>(cityMap.values());
        System.out.println(tp);

        for (Integer p : tp) {
            totalPopulation = p;
        }

        System.out.println("Total population: " + totalPopulation);

        System.out.println("_______________________set of cicties___________________________");
        Set<String> citySet = cityMap.keySet();
        citySet.forEach(System.out::println);

        System.out.println("_______________________Map: cityMap___________________________");

        for (String key : cityMap.keySet()) {
            System.out.println("Key: " + key + ", value: " + cityMap.get(key));
        }
        // cityMap.forEach((key, value) -> System.out.println("Key: " + key + " value: " + value));

        System.out.println("_______________________Entry: cityMap___________________________");
        //Set<Map.Entry<K,V>>




    }
}
