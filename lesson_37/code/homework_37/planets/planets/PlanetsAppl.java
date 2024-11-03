package homework_37.planets.planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Вывести список планет отсортированный по:
// - порядку расположения в солнечной системе;
// - алфавиту;
// - массе;
// - количеству спутников.

public class PlanetsAppl {
    public static void main(String[] args) {

        Planets planets;

        List<Planets> planetsList = new ArrayList<>();
        planetsList.add(new Planets("Mars", 227.9, 0.107, 2));
        planetsList.add(new Planets("Earth", 149.6, 1.0, 1));
        planetsList.add(new Planets("Jupiter", 778.3, 317.8, 79));
        planetsList.add(new Planets("Mercury", 57.9, 0.055, 0));
        planetsList.add(new Planets("Saturn", 1427.0, 95.2, 83));
        planetsList.add(new Planets("Venus", 108.2, 0.815, 0));
        display(planetsList);

        // - порядку расположения в солнечной системе;

        Comparator<Planets> comparator = new Comparator<Planets>() {
            @Override
            public int compare(Planets d1, Planets d2) {
                return Double.compare(d1.getDistanceTiTheSun(),d2.getDistanceTiTheSun());
            }
        };
        planetsList.sort(comparator);
        System.out.println("Sorting the planets by order of location in the solar system: ");
        display(planetsList);

        // - алфавиту;

        Comparator<Planets> comparator1 = new Comparator<Planets>() {
            @Override
            public int compare(Planets a1, Planets a2) {
                return a1.getName().compareTo(a2.getName());
            }
        };
        planetsList.sort(comparator1);
        System.out.println("Sorting the planets by alphabet: ");
        display(planetsList);

        // - массе;

        Comparator<Planets> comparator2 = new Comparator<Planets>() {
            @Override
            public int compare(Planets w1, Planets w2) {
                return Double.compare(w1.getWeight(),w2.getWeight());
            }
        };
        planetsList.sort(comparator2);
        System.out.println("Sorting the planets by weight: ");
        display(planetsList);

        // - количеству спутников.

        Comparator<Planets> comparator3 = new Comparator<Planets>() {
            @Override
            public int compare(Planets n1, Planets n2) {
                return Double.compare(n1.getNumberOfSatellites(),n2.getNumberOfSatellites());
            }
        };
        planetsList.sort(comparator3);
        System.out.println("Sorting planets by number of satellites: ");
        display(planetsList);


    } // end of main

    public static void display(List<Planets> planetsList){

        for (Planets planets : planetsList) {
            System.out.println(planets);
        }
        System.out.println("___________________________________________________");
    }
} // end of class
