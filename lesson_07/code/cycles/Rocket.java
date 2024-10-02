package cycles;

//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".


public class Rocket {

    public static void main(String[] args) {

        // задаем стартовые условия
        int countDown = 10;
        System.out.println( " We have " + countDown + " sec before start.");

        while ( countDown > 0 ){
            countDown -- ; // countDown = countDown - 1
            System.out.println(" We have " + countDown + " till start. ");

        } // end of cycle

        System.out.println( "Here we go! Поехали!!!.... " );

    } // end of main

} // end of class
