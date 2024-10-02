package classwork_10;

// Создайте массив, который содержит возраст студентов группы.
//  - какой возраст максимальный
//  - какой возраст минимальный?

public class MinMaxElement {

    public static void main(String[] args) {

        int [] ages = { 47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        int min = ages[0];
        int max = ages[0];

        for (int i = 0; i < ages.length; i++) {

            if(ages[i] < min){

                min = ages[i];
            }

        }

        System.out.println(" Min age = " + max);

        for (int i = 0; i < ages.length; i++) {

            if(ages[i] > max){

                max = ages[i];
            }

        }

        System.out.println(" Max age = " + max);

    }
}
