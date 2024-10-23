package classwork_30.sorting_integer;

import java.util.Arrays;

public class SortingInteger {
    public static void main(String[] args) {

        Integer[] numbers = {
                -100,
                2,
                Integer.MAX_VALUE,
                2,
                15,
                35,
                Integer.MIN_VALUE,
                71
        };

        //Arrays.sort(numbers);
        Arrays.sort(numbers,(n1,n2) -> Integer.compare(n2,n1));

        // draft printing
        System.out.println(Arrays.toString(numbers));

        // for-each

        int index = 0;
        for (Integer number : numbers) { // пишем iter и формируется такой синтаксис for (тип данных : элементы)
            System.out.print(number + " - " + index + " | " );
            index++;
        }
    }


} // end of class
