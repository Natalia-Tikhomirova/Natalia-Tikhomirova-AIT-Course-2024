package classwork_19.compare_string;

// равенство строк - как понять?

public class CompareStringAppl {
    public static void main(String[] args) {

        int x = 5; // стек
        int y = 5; // стек

        boolean checker = ( x == y );
        System.out.println(checker); // true

        String str1 = " Europe "; // str 1 - steak => (link), Europe - heap
        String str2 = " Europe "; // str 2 - steak => (link), Europe - heap

        System.out.println("_________________________________________________");

        checker = ( str1 == str2 ); // compare strings
        System.out.println(checker); // true

        System.out.println("_________________________________________________");

        String str3 = new String( " Europe "); // create new object
        checker = ( str1 == str3 );
        System.out.println(checker); // false, because links NOT equals! - Ссылки НЕ равны!

        System.out.println("_________________________________________________");

        checker = str1.equals(str3); // метод вызывается через точку - compare Strings with method equals
        System.out.println(checker);

    } // end of main
} // end of class
