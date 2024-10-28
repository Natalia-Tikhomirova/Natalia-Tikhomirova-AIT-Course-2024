package classwork_33.month;

public class MonthAppl {

    public static void main(String[] args) {

        Month m = Month.AUG;
        System.out.println("Start month: " + m);

        int k = 6; // + 6 month (по условию задачи)

        m = m.plusMonth(k);
        System.out.println("After " + k + " months: " + m); // FEB

    } // end of method
} // end of class
