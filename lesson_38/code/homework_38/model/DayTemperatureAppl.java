package homework_38.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
// Создайте класс DayTemperature c полями:
//- LocalDate date;
// - double temperature;
// Сформируйте два ArrayList и внесите в них данные измерений температуры.
// Рассчитайте среднюю температуру в городе за прошедшие две недели.
// В какой день была минимальная температура? В какой день максимальная?

public class DayTemperatureAppl {


    public static void main(String[] args) {

        ArrayList<DayTemperature> temperaturesOct = new ArrayList<DayTemperature>();

        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,25), 14.2));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,26), 13));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,27), 20));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,28), 17.6));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,29), 15));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,30), 12.8));
        temperaturesOct.add(new DayTemperature(LocalDate.of(2024,10,31), 14.2));

        ArrayList<DayTemperature> temperaturesNov = new ArrayList<>();

        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,1), 11.6));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,2), 12));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,3), 9));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,4), 14.8));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,5), 13.1));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,6), 8));
        temperaturesNov.add(new DayTemperature(LocalDate.of(2024,11,7), 9.5));

        // Merging list

        ArrayList<DayTemperature> mergeList = new ArrayList<>(temperaturesOct);
        mergeList.addAll(temperaturesNov);
        System.out.println(mergeList);


        // Рассчитайте среднюю температуру в городе за прошедшие две недели:
        AverageSumTemperatures(mergeList);

        // В какой день была минимальная температура? В какой день максимальная?

        Comparator<DayTemperature> comparator = new Comparator<DayTemperature>() {
            @Override
            public int compare(DayTemperature t1, DayTemperature t2) {
                return Double.compare(t1.getTemperature(), t2.getTemperature());
            }
        };
        mergeList.sort(comparator);
        System.out.println("Min temperature: " + mergeList.get(0)); // min
        System.out.println("Max temperature: " + mergeList.get(mergeList.size() - 1)); // max
    } // end of main

    private static void AverageSumTemperatures(ArrayList<DayTemperature> mergeList) {
        int totalTemperature = 0;
        int count = 0;

        for (DayTemperature dayTemperature : mergeList) {

            totalTemperature += dayTemperature.getTemperature();
            count++;
        }
        System.out.println("Average temperature: " + (double)totalTemperature / count + " C");
    } // end of method
} // end of class
