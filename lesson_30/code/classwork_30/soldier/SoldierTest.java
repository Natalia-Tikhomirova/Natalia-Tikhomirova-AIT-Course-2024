package classwork_30.soldier;

// - John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann", 162, 55, 88


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[]{

                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("John", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)
        };
    } // end of method

    //  отсортировать солдат "естественным" образом - по росту
    @Test
    void testNativeSorting(){
        System.out.println("___________________Print as is______________________________");
        printArray(soldiers);
        Arrays.sort(soldiers); // native, by default
        System.out.println("________________Print after sorting____________________________");
        printArray(soldiers);
    }


    // отсортировать по имени

    @Test
    void testSortingByName(){
        Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier n1, Soldier n2) {
                // return name1.getName().compareTo(name2.getName());
                 return - n1.getName().compareTo(n2.getName()); // reverse sorting (добавили минус в начале)
                //return name2.getName().compareTo(name1.getName());
            }
        };
        System.out.println("___________________Print as is______________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,comparatorByName); // by name
        System.out.println("________________Print after sorting by name______________________");
        printArray(soldiers);
    }

    // по весу

    @Test
    void testSortingByWeight(){
        System.out.println("___________________Print as is______________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,(w1,w2) -> Double.compare(w1.getWeight(), w2.getWeight()));
        System.out.println("______________Print after sorting by weight____________________");
        printArray(soldiers);
    }

    // two and more sorting:
    @Test
    void testByNameAndHeight(){

        Comparator<Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res != 0? res:Integer.compare(o1.getHeight(),o2.getHeight());
            }
        };
        System.out.println("___________________Print as is______________________________");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorNameAndHeight);
        System.out.println("___________Print after sorting by name and weight____________");
        printArray(soldiers);
    }

    // по значению profile и росту

    @Test
    void testSortSoldiersByProfile(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // reverse sort by Profile
            // return res !=0 ? res : - s1.getHeight() + s2.getHeight();
            return res !=0 ? res : - Integer.compare(s1.getHeight(),s2.getHeight());
        });
        printArray(soldiers);
    }

    // проверить работу метода binarySearch на массиве объектов
    @Test
    void testBinarySearch(){
        System.out.println("___________________Print as is______________________________");
        printArray(soldiers);
        Arrays.sort(soldiers,(s1,s2) -> (s1.getProfile()) - s2.getProfile());
        System.out.println("___________Print after sorting by profile____________");
        printArray(soldiers);

        // create object - pattern for searching
        Soldier pattern = new Soldier(null,0,0,91);

        int index = Arrays.binarySearch(soldiers,pattern,(s1,s2) -> (s1.getProfile()) - s2.getProfile());
        System.out.println( "Index = "+ index);
    }

    public void printArray(Object[] array ){ // печатает любой массив объекта

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


} // end of class