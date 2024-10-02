package methods;

public class Turnip {
    public static void main(String[] args) {

        planted(); // Посадил дед репку
        character(); // Вызов персонажей
        pulledout(); // Вытянули репку

    } // end of main

    public static void planted(){
        System.out.println("Посадил дед репку.");
        System.out.println("Выросла репка большая пребольшая.");

    }
    public static void pulledout(){
        System.out.println("Вытянули репку.");
    }

    public static void character(){

        grandfather();
        grandmother();
        granddauhter();
        zhuchka();
        cat();
        mouse();
    }
    public static void grandfather() {
        System.out.println("Тянет дед потянет, вытянуть не может.");
        System.out.println("Позвал дед бабку.");

    }

    public static void grandmother(){
        System.out.println("Тянет бабка потянет, вытянуть не может.");
        System.out.println("Позвала бабка внучку.");

    }

    public static void granddauhter(){
        System.out.println("Тянет внучка потянет, вытянуть не может.");
        System.out.println("Позвала внучка Жучку.");
    }

    public static void zhuchka(){
        System.out.println("Тянет Жучка потянет, вытянуть не может.");
        System.out.println("Позвала Жучка кошку.");
    }

    public static void cat(){
        System.out.println("Тянет кошка потянет, вытянуть не может.");
        System.out.println("Позвала кошка мышку.");

    }

    public static void mouse(){
        System.out.println("Тянет мышка потянет.");

    }






} // end of class
