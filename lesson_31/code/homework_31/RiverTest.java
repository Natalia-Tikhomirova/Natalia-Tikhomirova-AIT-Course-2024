package homework_31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River[] rivers;

    @BeforeEach
    void setUp() {

        rivers = new River[6];
        rivers[0] = new River("Nile", 6650);
        rivers[1] = new River("Amazon", 6400);
        rivers[2] = new River("Yangtze", 6300);
        rivers[3] = new River("Mississippi", 6275);
        rivers[4] = new River("Yenisei", 5539);
        rivers[5] = new River("Yellow", 5464);

    }

    public void printArray(Object[]array,String titleOfReport){

        System.out.println("_________________________" + titleOfReport + "__________________________");

        for (Object element : array) {
            System.out.println(element);
        }
    }

    // Распечатать в отсортированном виде.
    // Есть ли в списке рек река с населением длиной 6275?
    // Отсортируйте список по алфавиту.
    // Есть ли в списке река по имени Amazon? Какой она имеет номер в списке?

    @Test
    void testComparable(){
        printArray(rivers, "List of rivers as is");
        Arrays.sort(rivers);
        printArray(rivers, "List of rivers sorted by length" );

        River pattern = new River(null, 6275);

        int index = Arrays.binarySearch(rivers,pattern);
        System.out.println(index);
    }

    @Test
    void testComporatorByName(){

        // Компаратор для сортировки по имени реки
        Comparator<River>comparatorByRiverName = new Comparator<River>() {
            @Override
            public int compare(River n1, River n2) {
                return n1.getName().compareTo(n2.getName());
            }
        };

        // Сортировка массива рек по имени
        Arrays.sort(rivers, comparatorByRiverName);

        // Вывод отсортированного массива
        printArray(rivers,"List of rivers sorted by name");

        // Ищем реку по имени с помощью binarySearch
        River pattern = new River("Lena",0);
        int index = Arrays.binarySearch(rivers,pattern,comparatorByRiverName);

        if(index > 0 ){
            System.out.println("Find river" + pattern.getName() + "on index: " + index + ".");
        }else {
            System.out.println("River " + pattern.getName() + " did not find, but it could be on index " + (-index - 1) + ".");
        }
    }

    // Скопируйте массив в другой, имеющий в 2 раза большую длину.
    // Отсортируйте полученный массив.
    // Имеется ли в списке рек река Elbe ?
    // "Elbe", 1_094

    @Test
    void testArrayCopy(){

        // Копируем массив с удвоенной длиной (половина будет null)
        River[] riversCopy = Arrays.copyOf(rivers,rivers.length * 2);
        printArray(riversCopy, " riversCopy as is");

        // Компаратор для сортировки по имени (nulls в конце)
        Comparator<River> comparatorByName = Comparator.nullsLast((r1,r2) -> r1.getName().compareTo(r2.getName()));

        // sorting
        Arrays.sort(riversCopy,comparatorByName);

        // print
        printArray(riversCopy,"riversCopy after sorting by name");

        // Шаблон для поиска
        River pattern = new River("Elbe",0);

        // Поиск по первой части массива, где нет null-элементов
        int index = Arrays.binarySearch(riversCopy,0,rivers.length,pattern,comparatorByName);

        // Печать индекса найденного элемента или позиции для вставки
        System.out.println("Index of Elbe: " + index);
    }

    // Вставьте реку Elbe в список, сохранив порядок сортировки по населению.
    // Вставляем в имеющийся список

    @Test
    void testInsertKeepSorting(){

        // Сортировка массива по длине (по умолчанию сортировка по length)
        Arrays.sort(rivers);                                  // by default sorting (length)
        printArray(rivers, "Native sorting");

        // increase up to 7
        River[] riversCopy7 = Arrays.copyOf(rivers,rivers.length + 1);
        River river = new River("Elbe",1_094);           // Новая река для вставки

        // Находим индекс, куда вставить реку, чтобы сохранить сортировку
        int index = Arrays.binarySearch(riversCopy7,0,riversCopy7.length - 1,river);
        index = index >= 0 ? index : - index - 1; // обработка индекса(раздвигаем массив для вставки)

        // подготовили место для вставки:
        System.arraycopy(riversCopy7,index,riversCopy7,index +  1,riversCopy7.length - index - 1);

        // Вставляем новую реку в рассчитанное место
        riversCopy7[index] = river;

        // Обновляем массив
        rivers = riversCopy7;

        printArray(rivers,"List with added river");

    }

} // end of class