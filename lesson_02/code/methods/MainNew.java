package methods;

public class MainNew {

    public static void main(String[] args) {
        method1();  // Запуск метода 1
    } // end of main

    public static void method1() {
        System.out.println("method1 начал работу");
        System.out.println("method1 вызывает method2");
        method2();  // Вызов метода 2
        System.out.println("method1 закончил работу");
    }

    public static void method2() {
        System.out.println("method2 начал работу");
        System.out.println("method2 вызывает method3");
        method3();  // Вызов метода 3
        System.out.println("method2 закончил работу");
    }

    public static void method3() {
        System.out.println("method3 начал работу");
        System.out.println("method3 закончил работу");
    }
}// end of class
