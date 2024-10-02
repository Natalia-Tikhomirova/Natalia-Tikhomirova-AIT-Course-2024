package methods;

public class Circus {

    public static void main(String[] args) {

        lightsOn();
        entertainer();
        lightsOff();

    }// end of main

    public static void lightsOn() {
        System.out.println("Lights Onnn!!!");
    }

    public static void lightsOff(){
        System.out.println("Lights Offf!!!");
    }

    public static void entertainer(){
            jogger();
            cloun();
            singer();
        }

        public static void jogger(){
            System.out.println("I'm jogging!!!");
        }

        public static void cloun(){
            System.out.println("I'm jocking!!!");
        }

        public static void singer(){
            System.out.println("I'm singing!!!");
        }


}// end of class
