package homework_37.computers.model;

// На основе класса Computer:
// - создать собственный ArrayList;
// - добавить в него не менее 6 элементов;
// - отсортировать список по бренду;
// - отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
// - подсчитать общий суммарный объем и среднее значение SSD.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer computer;
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer(1234567890L,"i7",8,256, "Acer",1200));
        computerList.add(new Computer(1234567891L,"i5",16,256, "HP",1500));
        computerList.add(new Computer(1234567892L,"AMD",8,256, "NoName",2000));
        computerList.add(new Computer(1234567893L,"Apple",8,256, "MacBook",2000));
        computerList.add(new Computer(1234567894L,"Apple",16,512, "MacBook Air",2500));
        computerList.add(new Computer(1234567895L,"i7",16,512, "Acer",1800));


        display(computerList);

       // - отсортировать список по бренду;
        Comparator<Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer c1, Computer c2) {
                return c1.getBrand().compareTo(c2.getBrand());
            }
        };
        computerList.sort(comparator);
        System.out.println("Sort computers by brand: ");
        display(computerList);

        // - отсортировать список по размеру RAM

        Comparator<Computer>comparator1 = new Comparator<Computer>() {
            @Override
            public int compare(Computer r1, Computer r2) {
                return Integer.compare(r1.getRam(),r2.getRam());
            }
        };
        computerList.sort(comparator1);
        System.out.println("Sort computers by RAM: ");
        display(computerList);

        // отсортировать список по размеру SSD при равенстве RAM

        Comparator<Computer>comparator2 = new Comparator<Computer>() {
            @Override
            public int compare(Computer c1, Computer c2) {
                int res = Integer.compare(c1.getRam(),c2.getRam());
                return res != 0 ? res : Integer.compare(c1.getSsd(),c2.getSsd()) ;
            }
        };
        computerList.sort(comparator2);
        System.out.println("Sort computers by RAM size, then by SSD size if RAM is equal: ");
        display(computerList);

        // - подсчитать общий суммарный объем и среднее значение SSD

        int totalSSd = 0; 
        int count = 0;

        for (Computer computer1 : computerList) {

            totalSSd += computer1.getSsd();
            count++;
        }
        System.out.println("Total SSD = " + totalSSd);
        System.out.println("Average value = " + (double)totalSSd / count);

    } // end of main

    public static void display(List<Computer> computerList) {
        for (Computer computer : computerList  ) {

            System.out.println(computer);
        }
        System.out.println("______________________________________________");

    }
} // end of class
