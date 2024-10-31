package homework_36;

// Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {

        ArrayList<Character> symbols = new ArrayList<>();
        for (char ch  = 'A'; ch <= 'Z'  ; ch++) {

            symbols.add(ch);
        }
        System.out.println("Alphabet symbols: " + symbols);
    }
 } // end of class
