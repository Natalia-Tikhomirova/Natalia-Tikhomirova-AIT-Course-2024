package methods;

public class Main {

    public static void main(String[] args) {
        method1();
        // Запускаем первый метод


    } // end of main

    static void method1(){
        System.out.println("method1 начал работу");
        method2();
        // Вызываем следующий метод

        System.out.println("method1 закончил работу");
    }
    static void method2(){
        System.out.println("method2 начал работу");
        method3();
        // Вызываем следующий метод

        System.out.println("method2 закончил работу");

    }
    static void method3(){

        System.out.println("method3 начал работу");
        System.out.println("method3 закончил работу");
    }

} // end of class