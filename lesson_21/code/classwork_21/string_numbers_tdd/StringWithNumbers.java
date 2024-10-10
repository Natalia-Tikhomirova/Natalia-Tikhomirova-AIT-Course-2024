package classwork_21.string_numbers_tdd;

// Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

public class StringWithNumbers {

    // fields

    private String string;

    // methods

    // constructor

    public StringWithNumbers(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }

    // 123 456 987 333

    public  int sumOfNumbersInString(String string){  // делаем public

        int sum = 0;
        String [] numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    } // end of method
} // end of class
