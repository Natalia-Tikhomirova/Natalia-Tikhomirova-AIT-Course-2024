
//Напишите программу, которая запрашивает упользователя пин-код и сдвиг для шифра Цезаря,а затем выводит зашифрованный пин-код.Шифр Цезаря сдвигает каждую цифру на определенное количество позиций.

import java.util.Scanner;

public class BankAppTask6 {

    public static void main(String[] args) {
        //4567 --> 2 ---> 6789
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пин-код: ");
        String pinCode = scanner.next();
        System.out.println("Введите сдвиг для шифра Цезаря (от 0 до 9): ");
        int cipherCaesar = scanner.nextInt();
        String result = "";
        for (int i = 0; i < pinCode.length(); i++) {
            char numChar = pinCode.charAt(i);
            if (numChar >= '0' && numChar <= '9') {
                char shiftedNum = (char) (numChar + cipherCaesar);
                if (shiftedNum > '9') {
                    shiftedNum = (char) (shiftedNum - 10);
                }
                result = result + shiftedNum;
            } else {
                result = result + numChar;
            }
        }
        System.out.println("Зашифрованный пин-код: " + result);
        scanner.close();
    }
}

