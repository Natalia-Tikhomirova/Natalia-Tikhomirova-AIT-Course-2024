package classwork_37.ilist.model;

import classwork_37.ilist.IlistImpl;
import homework_32.car_garage.ait.cars.model.Car;

import java.util.ArrayList;
import java.util.List;

public class IlistAppl {
    public static void main(String[] args) {

        // список с целыми числами
        Ilist<Integer> listOfAges = new IlistImpl<>();

        listOfAges.add(61);
        listOfAges.add(38);
        listOfAges.add(37);
        listOfAges.add(35);
        listOfAges.add(44);
        listOfAges.add(27);
        listOfAges.add(37);
        listOfAges.add(48);
        listOfAges.add(27);
        listOfAges.add(23);
        listOfAges.add(61);
        listOfAges.add(61);
        listOfAges.add(61);
        listOfAges.add(63);


        System.out.println(listOfAges.size());
        System.out.println(listOfAges.indexOf(61)); // 0
        System.out.println(listOfAges.indexOf(63)); // 13
        System.out.println(listOfAges.indexOf(37)); // 2

        int index = 0;
        for (Integer i : listOfAges) {
            // System.out.println(listOfAges.indexOf(i) + ":" + i);

            System.out.println(index++ + ":" + i);
        }

        System.out.println("_________________________________________________________");

        for (int i = 0; i < listOfAges.size(); i++) {
            if (listOfAges.get(i) == 37) {
                System.out.println(i + " : 37");
            }
        }

        int sum = 0;
        for (Integer i : listOfAges) {
            sum+= i;
        }
        double averageAge = (double) sum / listOfAges.size();
        System.out.println("_________________________________________________________");
        System.out.println(sum);
        System.out.println(averageAge);

        //

        Ilist<String> listOfNames = new IlistImpl<>();
        listOfNames.add("Leonid");
        System.out.println(listOfNames.size());
        listOfNames.add("Artem");
        listOfNames.add("Diana");
        listOfNames.add("Dmitri");
        listOfNames.add("Karina");
        listOfNames.add("Dmitri");
        listOfNames.add(null);
        listOfNames.add("German");
        listOfNames.add("Natalia");
        listOfNames.add("Elena");
        System.out.println(listOfNames.size());

        // print
        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ +" : " + str);
        }

        String strTotal = "";
        for (String str : listOfNames) {
            strTotal += str;
            System.out.println(strTotal);
        }

        System.out.println("_________________________________________________________");
        System.out.println(strTotal);

        listOfNames.remove(3);

               index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ +" : " + str);
        }

        System.out.println("_________________________________________________________");

        listOfNames.remove("Leonid");
        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ +" : " + str);
        }

        List<Car> carList = new ArrayList<>();


    } // end of main
} // end of class
