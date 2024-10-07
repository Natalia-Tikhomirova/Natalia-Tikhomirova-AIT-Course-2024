package homework_17.HW;

import homework_17.HW.model.IbanCode1;

public class IbanCode1Appl {
    public static void main(String[] args) {

        IbanCode1 iban1 = new IbanCode1("DE52 2345 3745 0967 2318 33");

        iban1.display();
        System.out.println("Number of characters: " + iban1.lengthCode());
        System.out.println("Sum of first two characters (according to ASCII): " + iban1.controlCode());
        System.out.println("IBAN is valid: " + iban1.isValid());

    }//end of main
} // end of class